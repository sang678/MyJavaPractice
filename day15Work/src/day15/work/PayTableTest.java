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
		
		pt[0] = new PayTable("소서노",750000,2,3);
		pt[1] = new PayTable("고주몽",800000,1,4);
		pt[2] = new PayTable("모팔모",650000,6,2);

		
		System.out.println("인센티브 비율을 입력하세요(0~1 사이 소수)");
		Salary.incentive = scan.nextFloat();
		System.out.println("인센티브 비율 : " + Salary.incentive);
		for(PayTable p : pt)
		{
			p.calc();
			System.out.println(p.out());
			Salary.count++;
		}
		System.out.println("인원수 : "+pt.length);
		
		System.out.println("인센티브 비율을 입력하세요(0~1 사이 소수)");
		Salary.incentive = scan.nextFloat();
		
		
		System.out.println("인센티브 비율 : " + Salary.incentive);
		for(PayTable p : pt)
		{
			p.calc();
			System.out.println(p.out());
			Salary.count++;
		}
		System.out.println("인원수 : "+pt.length);
		
		
		savePayTable(pt);
		loadPayTable();
	}
	
	private static void savePayTable(PayTable pt[])
	{
		System.out.println("저장을 시도합니다.");
		
		
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
		
		
		System.out.println("저장완료");
		
	
		
		
	}
	
	private static void loadPayTable()
	{
		
		System.out.println("저장된 데이터를 불러와 출력합니다.");
		
		File file = new File("paytable.dat");
		
		FileInputStream fin = null;
		ObjectInputStream objin = null;
		try {
			fin = new FileInputStream(file);
			objin = new ObjectInputStream(fin);
			
			PayTable pt[] = (PayTable[]) objin.readObject();
		
			System.out.println("인원수 : "+pt.length);
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
		
		System.out.println("데이터 불러오기 및 출력이 완료되었습니다.");
		
	}
	
	
	

}
