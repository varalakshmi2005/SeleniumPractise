package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSeleniumTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement clickhello=driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
		clickhello.click();
		Thread.sleep(3000);
		WebElement enteremailornumber=driver.findElement(By.xpath("//*[@id='ap_email']"));
		enteremailornumber.sendKeys("9885194569");
		
		
		WebElement continuebutton=driver.findElement(By.xpath("//*[@id='continue']"));
		
		continuebutton.click();
		WebElement password=driver.findElement(By.xpath("//*[@id='ap_password']"));
		password.sendKeys("Lucky@12345");
		
		WebElement Login=driver.findElement(By.xpath("//*[@id='signInSubmit']"));
		Login.click();
		
		Thread.sleep(3000);
		WebElement Radiobutton=driver.findElement(By.xpath("//input[@name='OTPChallengeOptions'and @value='mobile']"));
		Radiobutton.click();		
		
		System.out.println(Radiobutton.isSelected());
		
				
		WebElement SendOTP=driver.findElement(By.xpath("//input[@id='continue' and @type='submit']"));
				/*("//span[contains(text(),'Send OTP')]"));*/
		
		SendOTP.click();
		
		Thread.sleep(7000);
		WebElement enterOtp=driver.findElement(By.xpath("//input[@class='a-button-input' and @type='submit']"));
		Thread.sleep(7000);
		enterOtp.click();
		
				
				
		/*WebElement searchbox=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
			       searchbox.sendKeys("iphone12");
			       
	    WebElement clicksearch=driver.findElement(By.xpath("//input[@value='Go']"));
	               clicksearch.click(); */
			       
		
		
		
		
	}

}
