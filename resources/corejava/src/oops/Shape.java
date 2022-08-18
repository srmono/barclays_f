package oops;

public interface Shape {
	public static final int i = 34;
	
	public abstract void calculateArea(int r);
	
}

class Circle implements Shape{

	public void calculateArea(int r) {
		System.out.println(" Area of the circle is" + (Math.PI * r * r));
		
	}
	
	public static void main(String[] args) {
		Shape s1 = new Circle();
		s1.calculateArea(27);
	}
	
}
