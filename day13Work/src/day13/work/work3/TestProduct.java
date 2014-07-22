package day13.work.work3;

import java.util.ArrayList;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> list = new ArrayList<Product>();
		
		list.add(new Product("力前1", 10000, 10));
		list.add(new Product("力前2", 20000, 20));
		list.add(new Product("力前3", 30000, 30));
		list.add(new Product("力前4", 40000, 40));
		list.add(new Product("力前5", 50000, 50));
		
		for(Product a : list)
		{
			System.out.println(a.printInfo());
		}
		
		
	}

}
