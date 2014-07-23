package day15.work;

import java.io.Serializable;

public class PayTable extends Salary implements Calculate, Output {
	

	
	public PayTable() {
		// TODO Auto-generated constructor stub
	}
	
	public PayTable(String name, long pay, int family, int overtime) {
		super(name, pay, family, overtime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calc() {
		// TODO Auto-generated method stub
		
		if(family<3)
			family_p = family*20000;
		else
			family_p = 60000;
		
		overtime_p = overtime * 5000;
		incen_p = (long)(incentive * pay);
		tax = (long)(pay * 0.1);
		total_pay = pay + family_p + incen_p + overtime_p - tax;
		
		
			
	}
	
	@Override
	public String out() {
		// TODO Auto-generated method stub
		return "Salary [name=" + name + ", pay=" + pay + ", family_p="
		+ family_p + ", overtime_p=" + overtime_p + ", incen_p="
		+ incen_p + ", tax=" + tax + ", total_pay=" + total_pay
		+ ", family=" + family + ", overtime=" + overtime + "]";
	}
	
	

	

}
