package Test;

public class ReverseString {
	public static void main(String args[])
	{
		String str="Varalakshmi ponna";
		int leng=str.length();
		String rev="";
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println("Reverse of " + str + " is " + rev);
		
	}

}
