package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class VerifyTitle {
	WebDriver driver;
	@Test
	//@Parameters({"browser"})
	public void verifypagetitle(){
		
	/*if(browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else
		if(browserName.equalsIgnoreCase("chrome"))
	{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
	}*/
	
	System.out.println(System.currentTimeMillis());
	driver.manage().window().maximize();
	System.out.println(System.currentTimeMillis());
	driver.get("https://learn-automation.com");
	
	System.out.println(driver.getTitle());
	
	driver.quit();
	
		
	}
	@Test
	public void verifybrowseropen()
	{
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	//@Parameters({"browser"})
	@BeforeMethod
	@Parameters({"browser"})
	public void method1(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
			if(browser.equalsIgnoreCase("chrome"))
		{
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}
	}

}
