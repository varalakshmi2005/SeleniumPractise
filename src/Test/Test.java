package Test;

public class Test {
	
	public static void main(String[] args)
	{
		FlipkartHomePage homepage=new FlipkartHomePage();
		homepage.Initialize();
		
		homepage.Navigate();
			
			
		
		FlipkartLoginPage login=new FlipkartLoginPage();
		
		login.getuserName().sendKeys("Test123");
		login.getpassword().sendKeys("Test123");
		login.getloginbutton().click();
		
		
	}

}
