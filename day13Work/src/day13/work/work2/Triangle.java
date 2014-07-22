package day13.work.work2;

public class Triangle implements Shape {
	
	private double bottom;
	private double height;
	
	public Triangle(double bottom, double height) {
		// TODO Auto-generated constructor stub
		
		this.bottom = bottom;
		this.height = height;
		
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height * bottom / 2;
	}
	
	public double getHypotenuse()
	{
		return Math.sqrt(height*height + (bottom/2)*(bottom/2));
	}
	
	@Override
	public double getPerim() {
		// TODO Auto-generated method stub
		return getHypotenuse()*2 + bottom;
	}

}
