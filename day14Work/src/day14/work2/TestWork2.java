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
		
		System.out.println("ó���� : " + s + " ó���� ���� : " + s.length());
		System.out.print("ó���� : ");
		System.out.print(ch);
		System.out.println(" ó���� ���� : " + ch.length);
		System.out.println("�빮�� ��ȯ : " + s2);
		
	}

}
