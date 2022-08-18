package com.barclays.patterns;

import com.barclays.phone.Android;
import com.barclays.phone.OS;
import com.barclays.phone.OperationSystemFactory;
import com.barclays.phone.Windows;

public class FactoryMain {
	public static void main(String[] args) {
		
		OperationSystemFactory osf = new OperationSystemFactory();
		
		//OS obj = new Windows();
		OS obj = osf.getInstance("any");
		obj.spec();
	}
}
