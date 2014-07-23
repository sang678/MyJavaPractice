package day15.work;

import java.io.Serializable;

public class Salary implements Serializable {
	
	protected String name;
	protected long pay;
	protected  long  family_p,  overtime_p, incen_p, tax, total_pay;
	protected int family,overtime;
	protected static float incentive=0.5f; //인센티브 - 초기값(0.5)
	protected static int count=0;        //총인원 - 초기값(0)
	
	public Salary() {
		// TODO Auto-generated constructor stub
	}

	public Salary(String name, long pay, int family, int overtime)
	{
		this.name = name;
		this.pay = pay;
		this.family = family;
		this.overtime = overtime;
	}
	
	
	public static void setIncentive(float incentive) {
		Salary.incentive = incentive;
	}
	


	

}
