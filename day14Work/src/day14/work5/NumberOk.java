package day14.work5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class NumberOk {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Random r = new Random();
	static int random= r.nextInt(101);
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberOk n = new NumberOk();
		int data, count=0;
		while(true)
		{
			data=n.questionNumber(n.getNumber());
			if(data==1)
				System.out.println("ũ��	�õ�Ƚ��:" + (++count) );
			else if(data == -1)
				System.out.println("�۴�	�õ�Ƚ��:" + (++count) );
			else
			{
				System.out.println("����!!" + count + " ������ ���߼̽��ϴ�\n ��� �����Ͻðڽ��ϱ�?(y/n)" );
				if(scan.next().charAt(0) == 'y')
				{
					count = 0;
					random = r.nextInt(101);
				}
				else
				{
					System.out.println("���α׷��� �����մϴ�");
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
			}
				
			
		
		}

	}
	
	public int getNumber()
	{
		System.out.println("���ڸ� �Է��ϼ���");
		try {
			return Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return -1;
	}
	
	public int questionNumber(int data)
	{
		if(data > random)
			return 1;
		else if(data == random)
			return 0;
		
		return  -1;
	}

}
