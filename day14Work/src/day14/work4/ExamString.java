package day14.work4;

import java.util.Locale;

public class ExamString {
	
	public ExamString() {
		// TODO Auto-generated constructor stub
	}
	
	public String preChar(String string)
	{
		return string.substring(0, 1).toUpperCase()+string.substring(1); 
	}
	
	public int charSu(String s, char ch)
	{
		
		int count=0;
		for(int i=0; i<s.length(); i++)
			if(s.charAt(i) == ch)
				count++;
		
		return count;
	}

}
