package com.ktnu.dto;

public class Student extends Subject implements Comparable<Subject>{
	
	//Filed
	
	private int no;
	private String name;
	private String professor;
	private String major;
	private char grade;
	private int rank;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int no, String name)
	{
		this.no = no;
		this.name = name;
	}
	public Student(int no, String name, String major)
	{
		this.no = no;
		this.name = name;
		this.major = major;
	}
	public Student(int no, String name, String major, String professor)
	{
		this.no = no;
		this.name = name;
		this.major = major;
		this.professor = professor;
	}
	
	public Student(int no, String name, double algorithm, double dataStructure, double swEngineering, double java)
	{
		super(algorithm, dataStructure, swEngineering, java);
		this.no = no;
		this.name = name;
		gradeCaculator();
	}
	
	public Student(int no, String name, String major, String professor, double algorithm, double dataStructure, double swEngineering, double java)
	{
		super(algorithm, dataStructure, swEngineering, java);
		this.no = no;
		this.name = name;
		this.major = major;
		this.professor = professor;
		gradeCaculator();
		
	}
	
	public void gradeCaculator() {
		// TODO Auto-generated method stub
		
		switch((int)super.avg/10)
		{
			case 10 :
			case 9 : grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade = 'C'; break;
			case 6 : grade = 'D'; break;
			default : grade = 'F'; break;
		}
		
	}
	@Override
	public int compareTo(Subject arg0) {
		// TODO Auto-generated method stub
		if(super.avg > arg0.avg )
		{
			return 1;
		}
		else if(super.avg == arg0.avg)
		{
			return 0;
		}
		
		
		return -1;
	}
	
	
	public void setMajor(String major) {
		this.major = major;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public char getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}
	public String getProfessor() {
		return professor;
	}
	public int getRank() {
		return rank;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "no : " + no + " name : " + name + " professor : " + professor + " major : " + major + " grade : " + grade + " rank : " + rank + " "  +  super.toString() ;
	}

}
