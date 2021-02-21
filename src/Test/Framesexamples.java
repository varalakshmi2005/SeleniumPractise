package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesexamples {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("WebDriver.chrome.driver","chrome.driver");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		Thread.sleep(5000);
		driver.switchTo().frame(1);//id of the frame
		System.out.println(driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText());
	
		Thread.sleep(5000);
				
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		Thread.sleep(5000);
		
		
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Mechanisms')]")).getText());
				
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//h2[text()='Packages']")).getText());
	}

}
