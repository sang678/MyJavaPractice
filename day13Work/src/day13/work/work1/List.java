package day13.work.work1;

import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Book> list = new LinkedList<Book>();
		list.add(new Book(1, "제목이제목", "작가가작가"));
		list.add(new Book(1, "책", "작가"));
		list.add(new Book(1, "제목이작가", "작가가제목"));
		
		for(int i =0; i<list.size(); i++)
		{
			System.out.println(list.get(i).toString());
		}
	}

}
