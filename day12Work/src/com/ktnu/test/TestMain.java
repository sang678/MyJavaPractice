package com.ktnu.test;

import java.util.Scanner;

import com.ktnu.controller.StudentManager;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();
	}
	
	static void menu()
	{
		StudentManager sm = new StudentManager();
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println( "1. 새 학생 정보 추가\n2. 학생 검색\n3. 학생 정보 수정\n4. 학생 삭제");
			System.out.println("5. 학생 정보 전체 출력\n6. 지도교수 그룹 출력");
			System.out.println("7. 전공 그룹 출력\n8. 성적순 오름차순정렬 출력\n9. 성적순 내림차순정렬 출력");
			System.out.println("10. 등수 적용 출력\n12. 종료");
			
			choice = scan.nextInt();
			
			switch(choice)
			{
				case 1:
					sm.addStudent(sm.inputData()); break;
				case 2:
					System.out.println("찾을 대상의 이름을 입력하시오");
					sm.display(sm.searchStudentFromName(scan.next()));break;
				case 3:
					System.out.println("수정할 대상의 이름을 입력하시오");
					sm.updateStudent(sm.searchStudentFromName(scan.next()));break;
				case 4:
					System.out.println("삭제할 대상의 이름을 입력하시오");
					sm.deleteStudent(sm.searchStudentFromName(scan.next()));break;
				case 5:
					sm.displayAll();break;
				case 6:
					System.out.println("해당 교수의 이름을 입력하시오");
					sm.sortScoreDecending(sm.professorGroup(scan.next()));break;
				case 7:
					System.out.println("해당 학과의 이름을 입력하시오");
					sm.sortScoreDecending(sm.majorGroup(scan.next()));break;
				case 8: sm.sortScoreDecending(); break;
				case 9: sm.sortScoreAscending(); break;
				case 10: sm.rankCalculator();
									
			}
			
		}while(choice != 12);
		
	}

}
