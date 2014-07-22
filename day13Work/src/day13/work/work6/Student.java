package day13.work.work6;

import java.util.ArrayList;


public abstract class Student implements Comparable<Student> {
	
	private int no;
	private int level;
	private String name;
	protected char gender;
	private double kor,eng,mat,tot,avg;
	private char grade;
	private int rank;
	
	public Student(int no, int level, String name, char gender, double kor, double eng, double mat) {
		// TODO Auto-generated constructor stub
		
		this.no = no;
		this.level = level;
		this.name = name;
		this.gender = gender;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}

	public void calcSungjuk()
	{
		tot = kor + eng + mat;
		avg = tot / 3;
		
		switch((int)(avg / 10))
		{
			case 10:
			case 9 : grade = 'A';
			case 8 : grade = 'B';
			case 7 : grade = 'C';
			case 6 : grade = 'D';
			default : grade = 'F';
			
		}
				
	}
	
	public abstract void rankCalc(ArrayList<Student> list);
	
	
	public double getAvg() {
		return avg;
	}
	public double getEng() {
		return eng;
	}
	public char getGender() {
		return gender;
	}
	public char getGrade() {
		return grade;
	}
	public double getKor() {
		return kor;
	}
	public double getMat() {
		return mat;
	}
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}
	public int getRank() {
		return rank;
	}
	public double getTot() {
		return tot;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(double kor) {
		this.kor = kor;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public void setEng(double eng) {
		this.eng = eng;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setMat(double mat) {
		this.mat = mat;
	}
	public void setTot(double tot) {
		this.tot = tot;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getLevel() {
		return level;
	}
	
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		if(tot>arg0.tot)
			return 1;
		else if(tot == arg0.tot)
			return 0;
		
		return -1;
	}
	
}
