package day14.work4;

import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamString ex = new ExamString();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열과 문자 하나를 입력해주세요");
		String inputString = scan.next();
		char inputChar = scan.next().charAt(0);
		
		System.out.println("첫 글자 대문자 변환 : " +  ex.preChar(inputString) + "문자열에서 해당문자와 일치하는 개수 : " + ex.charSu(inputString,inputChar));
		
	}

}
