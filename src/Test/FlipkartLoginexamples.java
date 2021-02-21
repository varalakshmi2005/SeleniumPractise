package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FlipkartLoginexamples {
	public static void main(String[] args){
		
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
        driver.navigate().to("http://www.flipkart.com");
        driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);
		Action action=actions.sendKeys(Keys.ESCAPE).build();
		action.perform();
		
		WebElement loginlink=driver.findElement(By.linkText("Login"));
		
		
		loginlink.click();
		
		 WebElement username=driver.findElement(By.xpath("//span[contains(text(),'Enter Email/Mobile number')]/../../input"));
		 
		 username.sendKeys("Test456");
			 WebElement password=driver.findElement(By.xpath("//span[contains(text(),'Enter Password')]/../../input"));
			 
			 password.sendKeys("Test456");
			 WebElement LoginButton=driver.findElement(By.xpath("//span[contains(text(),'Login')]/../../button"));
			 
			 LoginButton.click();
		
		
	}

}
