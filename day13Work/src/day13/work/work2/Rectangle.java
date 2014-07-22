package day13.work.work2;

public class Rectangle implements Shape{
	
	private double width;
	private double height;
	
	
	public Rectangle(double width, double height) {
		// TODO Auto-generated constructor stub
		
		this.height = height;
		this.width = width;
			
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height*width;
	}
	
	@Override
	public double getPerim() {
		// TODO Auto-generated method stub
		return height*2 + width*2;
	}
	

}
