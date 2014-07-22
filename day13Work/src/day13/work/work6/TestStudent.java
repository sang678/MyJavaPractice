package day13.work.work6;

import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> man = new ArrayList<Student>();
		ArrayList<Student> woman = new ArrayList<Student>();
		
		man.add(new ManSchool(1, 1, "남성1", 'M', 40, 40, 40, 40));
		man.add(new ManSchool(2, 2, "남성2", 'M', 50, 50, 50, 50));
		man.add(new ManSchool(3, 3, "남성3", 'M', 60, 60, 60, 60));
		
		woman.add(new WomanSchool(1, 1, "여성1", 'F', 40, 40, 40, 40));
		woman.add(new WomanSchool(2, 2, "여성2", 'F', 60, 60, 60, 60));
		woman.add(new WomanSchool(3, 3, "여성3", 'F', 70, 70, 70, 70));
		woman.add(new WomanSchool(4, 4, "여성4", 'F', 50, 50, 50, 50));
		
		man.get(0).calcSungjuk();
		man.get(1).calcSungjuk();
		System.out.println("test branch");
		
		for(int i = 0 ; i<man.size(); i++)
		{
			man.get(i).calcSungjuk();
			
		}
		
		for(int i = 0 ; i<woman.size(); i++)
		{
			woman.get(i).calcSungjuk();
			
		}
		
		
		man.get(0).rankCalc(man);
		woman.get(0).rankCalc(woman);
		for(int i = 0 ; i<woman.size(); i++)
		{
			 Student s = woman.get(i);
			 s.setRank(i+1);
			 System.out.println("학번 : " + s.getNo() + " 학년 : " + s.getLevel() + " 이름 : " + s.getName() + " 성별 : " + s.getGender() + " 평균 : " + s.getAvg()  + " 등수 : "+ s.getRank());
			
		}
		for(int i = 0 ; i<man.size(); i++)
		{
			 Student s = man.get(i);
			 s.setRank(i+1);
			 System.out.println("학번 : " + s.getNo() + " 학년 : " + s.getLevel() + " 이름 : " + s.getName() + " 성별 : " + s.getGender() + " 평균 : " + s.getAvg()  + " 등수 : "+ s.getRank());
		}
	}

}

