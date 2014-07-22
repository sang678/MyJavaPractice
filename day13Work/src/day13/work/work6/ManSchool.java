package day13.work.work6;

import java.util.ArrayList;
import java.util.Collections;

public class ManSchool extends Student{
	
	double gasa;
	
	public ManSchool(int no, int level, String name, char gender, double kor, double eng, double mat, double gasa) {
		// TODO Auto-generated constructor stub
		super(no, level, name, gender, kor, eng, mat);
		
		this.gender = gender; 
		this.gasa = gasa;
		
		
	}
	
	@Override
	public void calcSungjuk() {
		// TODO Auto-generated method stub
		setTot(getKor() + getEng() + getMat()+gasa);
		setAvg(getTot() / 4);
		
		switch((int)(getAvg() / 10))
		{
			case 10:
			case 9 : setGrade('A');
			case 8 : setGrade('B');
			case 7 : setGrade('C');
			case 6 : setGrade('D');
			default : setGrade('F');
			
		}
		
	}
	
	@Override
	public void rankCalc(ArrayList<Student> list) {
		// TODO Auto-generated method stub
		
		Collections.sort(list, Collections.reverseOrder());
		
	}
	
	public double getGasa() {
		return gasa;
	}
	public void setGasa(double gasa) {
		this.gasa = gasa;
	}

}
