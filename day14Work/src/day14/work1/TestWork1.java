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
			case 1: d='일'; break;
			case 2: d='월'; break;
			case 3: d='화'; break;
			case 4: d='수'; break;
			case 5: d='목'; break;
			case 6: d='금'; break;
			case 7: d='토'; break;
			
			
		}
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1;
		day = cal.get(Calendar.DATE);
		hour = cal.get(Calendar.HOUR);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
		
		
		System.out.println(year +"년 " + month + "월 " + day + "일 " + d +"요일 " + hour + "시 " + minute + "분 " + second + "초 " );
		
		
		
		
	}

}
