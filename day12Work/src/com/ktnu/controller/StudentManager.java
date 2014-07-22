package com.ktnu.controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.ktnu.dto.Student;

public class StudentManager {
	
	HashMap<Integer, Student> students ;
	
	int count=0;
	
	public StudentManager() {
		// TODO Auto-generated constructor stub
		students = new HashMap<Integer, Student>();
	}
	
	
	public Student inputData()
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��ȣ �Է�-��� �۾��� ��ȣ�� ó��");
		int no = scan.nextInt();
		
		System.out.println("�̸� �Է�");
		String name = scan.next();

		System.out.println("���� �Է� ");
		String major = scan.next();

		System.out.println("���� �̸� �Է� ");
		String professor = scan.next();
		
		System.out.println("�˰��� ���� �Է� ");
		double algorithm = scan.nextDouble();
		
		System.out.println("�ڷᱸ�� ���� �Է� ");
		double dataStructure = scan.nextDouble();
	
		System.out.println("����Ʈ���� ���� ���� �Է� ");
		double swEngineering = scan.nextDouble();
		
		System.out.println("�ڹ� ���� �Է� ");
		double java = scan.nextDouble();
		return new Student(no, name, major, professor, algorithm, dataStructure, swEngineering, java);
	}
	
	public void addStudent(Student s)
	{
		students.put(count, s);
		count ++;
	}
	
	
	public int searchStudentFromName(String name)
	{
		int i=0;
		for(; i<=students.size(); i++)
			if(students.get(i).getName().equals(name))
				break;
		
		return i;
	}
	
	public void deleteStudent(int index)
	{
		if(index == -1 || count == index)
			System.out.println("������");
		else
		{
			students.remove(index);
			count--;
		}
	}
	
	public void displayAll()
	{
		System.out.println(students);
	}
	
	public void display(int index)
	{
		System.out.println(students.get(index).toString());
	}
	
	
	public int getSize()
	{
		return students.size();
	}
	
	 
	 
	public void updateStudent(int index)
	{
		
		Student s = students.get(index);
		s = inputData();
		
	}
	 
	public void sortScoreAscending()
	{
		
		ArrayList<Student> s = new ArrayList<Student>();
		
		
		s.addAll(students.values());
		
		Collections.sort(s);
		
		System.out.println(s);
		
		
		
	}
	
	public void sortScoreDecending()
	{
		
		ArrayList<Student> s = new ArrayList<Student>();
		
		
		s.addAll(students.values());
		
		Collections.sort(s , Collections.reverseOrder());
		
		System.out.println(s);
		
		
		
	}
	
	public void sortScoreDecending(HashMap<Integer,Student> data)
	{
		
		ArrayList<Student> s = new ArrayList<Student>();
		
		
		s.addAll(data.values());
		
		Collections.sort(s , Collections.reverseOrder());
		
		System.out.println(s);
		
				
		
	}
	public void rankCalculator()
	{
		ArrayList<Student> s = new ArrayList<Student>();
		
		
		s.addAll(students.values());
		
		Collections.sort(s , Collections.reverseOrder());
		Iterator i =  s.iterator();
		int rank = 1;
		while(i.hasNext())
		{
			
			Student temp = (Student) i.next();
			temp.setRank(rank++);
			System.out.println(temp);
		}
		
	}
	public HashMap<Integer,Student> professorGroup(String professor)
	{
		HashMap<Integer,Student> hm = new HashMap<Integer,Student>();
		
		for(int i =0; i<count; i++)
			if(students.get(i).getProfessor().equals(professor))
				hm.put(i, students.get(i));
		
		
		
		return hm;
		
	}
	
	public HashMap<Integer,Student> majorGroup(String major)
	{
		HashMap<Integer,Student> hm = new HashMap<Integer,Student>();
		
		for(int i =0; i<count; i++)
			if(students.get(i).getProfessor().equals(major))
				hm.put(i, students.get(i));
		
		
		
		return hm;
		
	}
}
