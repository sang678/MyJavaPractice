package day15.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PayTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PayTable pt[] = new PayTable[3];
		Scanner scan = new Scanner(System.in);
		
		pt[0] = new PayTable("�Ҽ���",750000,2,3);
		pt[1] = new PayTable("���ָ�",800000,1,4);
		pt[2] = new PayTable("���ȸ�",650000,6,2);

		
		System.out.println("�μ�Ƽ�� ������ �Է��ϼ���(0~1 ���� �Ҽ�)");
		Salary.incentive = scan.nextFloat();
		System.out.println("�μ�Ƽ�� ���� : " + Salary.incentive);
		for(PayTable p : pt)
		{
			p.calc();
			System.out.println(p.out());
			Salary.count++;
		}
		System.out.println("�ο��� : "+pt.length);
		
		System.out.println("�μ�Ƽ�� ������ �Է��ϼ���(0~1 ���� �Ҽ�)");
		Salary.incentive = scan.nextFloat();
		
		
		System.out.println("�μ�Ƽ�� ���� : " + Salary.incentive);
		for(PayTable p : pt)
		{
			p.calc();
			System.out.println(p.out());
			Salary.count++;
		}
		System.out.println("�ο��� : "+pt.length);
		
		
		savePayTable(pt);
		loadPayTable();
	}
	
	private static void savePayTable(PayTable pt[])
	{
		System.out.println("������ �õ��մϴ�.");
		
		
		File file = new File("paytable.dat");
		
		FileOutputStream fout = null;
		ObjectOutputStream objout = null;
			
		
		try {
			fout = new FileOutputStream(file);
			objout = new ObjectOutputStream(fout);
			
			objout.writeObject(pt);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				objout.close();
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		System.out.println("����Ϸ�");
		
	
		
		
	}
	
	private static void loadPayTable()
	{
		
		System.out.println("����� �����͸� �ҷ��� ����մϴ�.");
		
		File file = new File("paytable.dat");
		
		FileInputStream fin = null;
		ObjectInputStream objin = null;
		try {
			fin = new FileInputStream(file);
			objin = new ObjectInputStream(fin);
			
			PayTable pt[] = (PayTable[]) objin.readObject();
		
			System.out.println("�ο��� : "+pt.length);
			for(PayTable p : pt)
				System.out.println(p.out());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				fin.close();
				objin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("������ �ҷ����� �� ����� �Ϸ�Ǿ����ϴ�.");
		
	}
	
	
	

}
