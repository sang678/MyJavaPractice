package day14.work3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class TestWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
		{	
			System.out.println("�̸� �Է� : ");
			String name = br.readLine();
			System.out.println("���� �Է� : ");
			int age = Integer.parseInt(br.readLine());
			System.out.println("���� �Է� : ");
			double salary = Double.parseDouble(br.readLine());
			System.out.println("���� �Է� : ");
			double tax = Double.parseDouble(br.readLine());
			
			list.add(new Employee("�����", 20, 1030, 0.25));
			list.add(new Employee("����", 30, 930, 0.34));
			list.add(new Employee("�����", 40, 730, 0.41));
			list.add(new Employee("�����", 50, 630, 0.37));
			list.add(new Employee(name, age, salary, tax));
		}catch(IOException e){
			e.printStackTrace();
		}
		
			
		
		
		Collections.sort(list);
		
		for(Employee e : list)
			System.out.println(e.toString() + " real-salary=" +e.getSalary()*(1-e.getTax()));
	}

}
