package collections.interfaces;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		//nullValue();
		unordered();
	}
	
	//set can contain one null value
	private static void nullValue() {
		Set<String> set = new HashSet<>();
		set.add(null);
		set.add(null);
		System.out.println(set.toString());
	}
	
	private static void unordered() {
		Set<String> set = new HashSet<>();
		set.add("element1");
		set.add("element2");
		set.add("element4");
		set.add("element7");
		set.add("element6");
		
		System.out.println(set.toString());
		
	}
}
