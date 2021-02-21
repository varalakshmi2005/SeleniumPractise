package Test;

import java.util.Scanner;

public class AddTwoNumberfromUser {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter First number");
		
		int a=scan.nextInt();
		System.out.print("Enter second number");
		int b=scan.nextInt();
		
		System.out.println(a+b);
	}

}
