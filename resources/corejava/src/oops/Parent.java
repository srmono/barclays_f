package oops;

public class Parent {

	//overridden method
	public void m1() {
		System.out.println("I am m1() method of parent");
	}
}

class Child extends Parent {
	
	//overriding methods
	public void m1() {
		System.out.println("I am m1() from child");
	}
}
