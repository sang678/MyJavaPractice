package day14.work1;

import java.util.Calendar;

public class TestWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		int year,month,day,hour,minute,second;
		char d = 0;
		
		switch(cal.get(Calendar.DAY_OF_WEEK))
		{
			case 1: d='��'; break;
			case 2: d='��'; break;
			case 3: d='ȭ'; break;
			case 4: d='��'; break;
			case 5: d='��'; break;
			case 6: d='��'; break;
			case 7: d='��'; break;
			
			
		}
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1;
		day = cal.get(Calendar.DATE);
		hour = cal.get(Calendar.HOUR);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
		
		
		System.out.println(year +"�� " + month + "�� " + day + "�� " + d +"���� " + hour + "�� " + minute + "�� " + second + "�� " );
		
		
		
		
	}

}
