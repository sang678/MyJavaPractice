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
			System.out.println( "1. �� �л� ���� �߰�\n2. �л� �˻�\n3. �л� ���� ����\n4. �л� ����");
			System.out.println("5. �л� ���� ��ü ���\n6. �������� �׷� ���");
			System.out.println("7. ���� �׷� ���\n8. ������ ������������ ���\n9. ������ ������������ ���");
			System.out.println("10. ��� ���� ���\n12. ����");
			
			choice = scan.nextInt();
			
			switch(choice)
			{
				case 1:
					sm.addStudent(sm.inputData()); break;
				case 2:
					System.out.println("ã�� ����� �̸��� �Է��Ͻÿ�");
					sm.display(sm.searchStudentFromName(scan.next()));break;
				case 3:
					System.out.println("������ ����� �̸��� �Է��Ͻÿ�");
					sm.updateStudent(sm.searchStudentFromName(scan.next()));break;
				case 4:
					System.out.println("������ ����� �̸��� �Է��Ͻÿ�");
					sm.deleteStudent(sm.searchStudentFromName(scan.next()));break;
				case 5:
					sm.displayAll();break;
				case 6:
					System.out.println("�ش� ������ �̸��� �Է��Ͻÿ�");
					sm.sortScoreDecending(sm.professorGroup(scan.next()));break;
				case 7:
					System.out.println("�ش� �а��� �̸��� �Է��Ͻÿ�");
					sm.sortScoreDecending(sm.majorGroup(scan.next()));break;
				case 8: sm.sortScoreDecending(); break;
				case 9: sm.sortScoreAscending(); break;
				case 10: sm.rankCalculator();
									
			}
			
		}while(choice != 12);
		
	}

}
