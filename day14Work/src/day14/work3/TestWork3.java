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
			System.out.println("이름 입력 : ");
			String name = br.readLine();
			System.out.println("나이 입력 : ");
			int age = Integer.parseInt(br.readLine());
			System.out.println("봉급 입력 : ");
			double salary = Double.parseDouble(br.readLine());
			System.out.println("세금 입력 : ");
			double tax = Double.parseDouble(br.readLine());
			
			list.add(new Employee("엄상근", 20, 1030, 0.25));
			list.add(new Employee("김상근", 30, 930, 0.34));
			list.add(new Employee("강상근", 40, 730, 0.41));
			list.add(new Employee("가상근", 50, 630, 0.37));
			list.add(new Employee(name, age, salary, tax));
		}catch(IOException e){
			e.printStackTrace();
		}
		
			
		
		
		Collections.sort(list);
		
		for(Employee e : list)
			System.out.println(e.toString() + " real-salary=" +e.getSalary()*(1-e.getTax()));
	}

}
