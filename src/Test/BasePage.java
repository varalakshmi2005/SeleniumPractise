package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	static WebDriver driver;
	public void Initialize()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	}
	public void closeDriver()
	{
		this.driver.quit();
	}
	public WebDriver getDriver()
	{
		return this.driver;
	}

}
