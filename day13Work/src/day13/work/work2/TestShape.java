package day13.work.work2;

public class TestShape {

	public static void main(String[] args) throws ZeroException {
		// TODO Auto-generated method stub
				
		for(int i=0; i<5; i++)
			if(Integer.parseInt(args[i]) == 0)
				throw new ZeroException();
		
		
		double radius = Double.parseDouble(args[0]);
		double width= Double.parseDouble(args[1]);
		double height = Double.parseDouble(args[2]);
		double bottom = Double.parseDouble(args[3]);
		double height2 = Double.parseDouble(args[4]);
		
		
		Shape sp = new Circle(radius);
		System.out.println(sp.getArea() + " " + sp.getPerim());
		
		sp = new Rectangle(width, height);
		System.out.println(sp.getArea() + " " + sp.getPerim());
		
		sp = new Triangle(bottom, height2);
		System.out.println(sp.getArea() + " " + sp.getPerim());
	

	}

}
