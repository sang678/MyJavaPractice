package day14.work2;

import java.util.StringTokenizer;

public class TestWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "J a v a  P r o g r a m";
		
		StringTokenizer st = new StringTokenizer(s, " ");
		
		char ch[] = new char[st.countTokens()];
		for(int i=0; st.hasMoreTokens(); i++)
			ch[i] = st.nextToken().charAt(0);
		
		
		
		
		String s2 = s.valueOf(ch);
		
		s2 = s2.toUpperCase();
		
		System.out.println("처리전 : " + s + " 처리전 개수 : " + s.length());
		System.out.print("처리후 : ");
		System.out.print(ch);
		System.out.println(" 처리후 개수 : " + ch.length);
		System.out.println("대문자 변환 : " + s2);
		
	}

}
