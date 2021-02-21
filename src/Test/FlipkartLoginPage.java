package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlipkartLoginPage extends BasePage{
	
	//private WebElement loginliknk=getDriver().findElement(By.linkText("Login"));
	
	//private WebElement loginliknk1=getDriver().findElement(By.xpath("//a[text()='Login']"));
	
	private WebElement username=getDriver().findElement(By.xpath("//span[contains(text(),'Enter Email/Mobile number')]/../../input"));
	
	private WebElement password=getDriver().findElement(By.xpath("//span[contains(text(),'Enter Password')]/../../input"));
	
	private WebElement LoginButton=getDriver().findElement(By.xpath("//span[contains(text(),'Login')]/../../button"));
	
	//public WebElement getLogin(){
		//return loginliknk;
	//}
	public WebElement getuserName(){
		return username;
	}
	
	public WebElement getpassword(){
		return password;
	}
	public WebElement getloginbutton(){
		return LoginButton;
	}
	/*public void Navigateto()
	{
		loginliknk.click();
	}*/

}
