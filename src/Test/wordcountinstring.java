package Test;

import java.util.Scanner;

public class wordcountinstring {
	
public static void main(String[] args)
{
	System.out.println("Enter the string");
	Scanner src=new Scanner(System.in);
	String s=src.nextLine();
	int count=1;
	for(int i=0;i<s.length()-1;i++)
	{
		if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
		{
			count++;
		}
	}
	System.out.println("Count the words :"+count);
	
}
	
}

