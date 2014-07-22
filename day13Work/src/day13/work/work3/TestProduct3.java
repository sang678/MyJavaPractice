package day13.work.work3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestProduct3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Product> hm = new HashMap<Integer,Product>();
		
		
		
		for(int i =0; i<5; i++)
		{
			hm.put(i, new Product("Á¦Ç°"+(i+1), 10000*(i+1),10*(i+1) ));
			
		}
		
		
		
		for(int i =0; i<hm.size(); i++)
		{
			System.out.println(hm.get(i).printInfo());
			
		}
		
	}

}
