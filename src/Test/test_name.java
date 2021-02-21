package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test_name {

	public static void main(String[] args) {
		System.out.println("Enter your sentence");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split("\\s");
		Map<String ,String> m=new HashMap<>();
		for(int i=0;i<s1.length;i++)
		{
			Boolean b=true;
			int count=1;
			for (int j=(i+1);j<s1.length;j++)
			{
				if(s1[i].contentEquals(s1[j]))
					count++;
			}
			for(String g:m.keySet())
{
if(s1[i].contentEquals(g))
	b=false;

}
			
			if(b)
			{
			m.put(s1[i], Integer.toString(count))	;
			}
			b=true;
		}
		
for(String k:m.keySet())
{
System.out.println(k + " is present for "+m.get(k)+" times" );	

}
	}

}
