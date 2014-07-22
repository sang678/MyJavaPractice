package day13.work.work3;

import java.util.ArrayList;

public class TestProduct2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> list = new ArrayList<Product>();
		
		list.add(new Product());
		list.add(new Product());
		list.add(new Product());
		list.add(new Product());
		list.add(new Product());
		
		for(int i =0; i<list.size(); i++)
		{
			list.get(i).setPname("Á¦Ç°"+(i+1));
			list.get(i).setPrice(10000*(i+1));
			list.get(i).setAmount(10*(i+1));
		}
		for(Product a : list)
		{
			System.out.println(a.printInfo());
		}
		
		
	}

}
