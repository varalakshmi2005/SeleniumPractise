package Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

//import Demo.WenElement;

public class interview_Launch {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.navigate().to("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
				
		
		Actions action = new Actions(driver);
		WebElement Signin=driver.findElement(By.xpath("//div[@class='accountInner']/span[1]"));
		
		action.moveToElement(Signin).build().perform();
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", Signin);
		
		
		WebElement Login=driver.findElement(By.xpath("//a[text()='login']"));
						
		Login.click();
		Thread.sleep(3000);
		System.out.println("Login Pop up is displayed");
		
		//Verifying Pop-Up conditions
		
		System.out.println("Verifying pop-up display");
		
		String loginframe="loginIframe";
		driver.switchTo().frame(loginframe);
		
		WebElement popup=driver.findElement(By.xpath("//div[@class='userAuth-card']"));
		
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		boolean popupframe=popup.isDisplayed();
		Assert.assertTrue(popupframe, "popup frame is displayed");
		
		
		//WebElement username=driver.findElement(By.xpath("//input[class='col-xs-24 clickOnceOnly']"));
				//username.sendKeys("9885194569");
				
        //username.sendKeys("varalakshmi");
		//Alert alret=driver.switchTo().alert();
		
		//alret.sendKeys("9885194569");
		WebElement username=driver.findElement(By.xpath("//input[contains(@placeholder,'Mobile Number/ Email')]"));
		 
		 username.sendKeys("9885194569");
		 WebElement conti=driver.findElement(By.id("checkUser"));
 		
	        conti.click();
	        
			 WebElement password=driver.findElement(By.xpath("//*[@id='j_password_login_uc']"));
			 
			 password.sendKeys("Amma@12345");
			 WebElement LoginButton=driver.findElement(By.id("submitLoginUC"));
					 //xpath("//span[contains(text(),'Login')]/../../button"));
			 
			 LoginButton.click();
			 Thread.sleep(8000);
             driver.close();    
		
        //WebElement conti=driver.findElement(By.xpath("//*[@id='checkUser']"));
        		
        //conti.click();
        
        		//driver.findElement(By.xpath("//*[@id='checkUser']")).click();

       //WebElement pass=driver.findElement(By.xpath("//*[@id='j_password_login_uc']"));
       //pass.sendKeys("Amma@12345");

       //WebElement Loginbutton=driver.findElement(By.xpath("//*[@id='submitLoginUC']"));
    		  // Loginbutton.click();
		

		
	}
}

     
	


