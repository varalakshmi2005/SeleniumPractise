package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class dropdownselectByvalue {
	public static void main(String[] args){
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("http://uitestpractice.com/Students/select");
		WebElement element=driver.findElement(By.id("countriesSingle"));
		
		
		SelectElement selectelement=
		
		
	}

}
