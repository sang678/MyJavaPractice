package day14.work4;

import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamString ex = new ExamString();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڿ��� ���� �ϳ��� �Է����ּ���");
		String inputString = scan.next();
		char inputChar = scan.next().charAt(0);
		
		System.out.println("ù ���� �빮�� ��ȯ : " +  ex.preChar(inputString) + "���ڿ����� �ش繮�ڿ� ��ġ�ϴ� ���� : " + ex.charSu(inputString,inputChar));
		
	}

}
