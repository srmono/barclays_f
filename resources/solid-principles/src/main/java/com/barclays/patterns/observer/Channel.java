package com.barclays.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

	List<Subscriber> subs = new ArrayList<Subscriber>();
	
	private String title;
	
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}
	
	public void unSubscribe(Subscriber sub) {
		subs.remove(sub);
	}
	
	public void notifySubscribers() {
		for(Subscriber sub: subs) {
			sub.update();
		}
	}
	
	public void upload(String title) {
		this.title = title;
		notifySubscribers();
	}
	
}


