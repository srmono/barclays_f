package com.barclays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.barclays.VO.Department;
import com.barclays.VO.ResponseTemplate;
import com.barclays.entity.User;
import com.barclays.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("save user inside user service");
		return userRepository.save(user);
	}

	public ResponseTemplate getUserWithDepartment(Long userId) {
		log.info("get user  with department inside user service");
		ResponseTemplate vo = new ResponseTemplate();
		
		User user = userRepository.findByUserId(userId);
		log.info("dep id {}", user.getDepartmentId());
		
		Department department = 
				restTemplate.getForObject(
						"http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), 
						Department.class
					);
		
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}
}
