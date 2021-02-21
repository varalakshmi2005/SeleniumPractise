package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHomePage extends BasePage {
	
	
	
	
	public void Navigate()
	{
		driver.navigate().to("http://www.flipkart.com");
		
		Actions actions=new Actions(driver);
		Action action=actions.sendKeys(Keys.ESCAPE).build();
		action.perform();
		
		 WebElement loginliknk1=getDriver().findElement(By.linkText("Login"));
		 loginliknk1.click();
	}
	
}
