package day13.work.work2;

public class Circle implements Shape{

	private double radius;
	
	
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
	}
	
	@Override
	public double getPerim() {
		// TODO Auto-generated method stub
		return radius*2*Math.PI;
	}
	
	
}
