package day13.work.work1;

import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Book> list = new LinkedList<Book>();
		list.add(new Book(1, "����������", "�۰����۰�"));
		list.add(new Book(1, "å", "�۰�"));
		list.add(new Book(1, "�������۰�", "�۰�������"));
		
		for(int i =0; i<list.size(); i++)
		{
			System.out.println(list.get(i).toString());
		}
	}

}
