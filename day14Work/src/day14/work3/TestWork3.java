package day14.work3;

import java.util.ArrayList;
import java.util.Collections;

public class TestWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("�����", 20, 1030, 0.25));
		list.add(new Employee("����", 30, 930, 0.34));
		list.add(new Employee("�����", 40, 730, 0.41));
		list.add(new Employee("�����", 50, 630, 0.37));
		list.add(new Employee("�ڻ��", 60, 530, 0.33));
		
		Collections.sort(list);
		
		for(Employee e : list)
			System.out.println(e.toString() + e.getSalary()*(1-e.getTax()));
	}

}
