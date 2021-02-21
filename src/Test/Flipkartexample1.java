package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Flipkartexample1 {
	
	public static void main(String[]args){
		
		System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		
		Actions actions=new Actions(driver);
		
		Action sendEsc=actions.sendKeys(Keys.ESCAPE).build();
		
		sendEsc.perform();
		
		driver.findElement(By.name("q")).sendKeys("Dell");
		
		driver.findElement(By.className("L0Z3Pu")).click();
		
		Action sendPageDown=actions.sendKeys(Keys.PAGE_DOWN).build();
		
		sendPageDown.perform();
		
		try{
			Thread.sleep(3000);
			
		}
		catch(InterruptedException e){
			e.printStackTrace();
			
		}
		
		String xpathNoRows="//*[@class='E2-pcE _1q8tSL']/div";
		
		List<WebElement> listtotal=driver.findElements(By.xpath(xpathNoRows));
		
		System.out.println("Total no of rows"+ listtotal.size());
		
		for(int i=1;i<listtotal.size();i++)
		{
			String xpathCol="//*[@class='E2-pcE _1q8tSL']/div["+i+"]/div";
			
			List<WebElement> listCols=driver.findElements(By.xpath(xpathCol));
			
			System.out.println("No of Cols are "+ listCols.size());
			
			for(int j=1;j<=listCols.size();j++)
			{
				String xpathProductName="//*[@class='E2-pcE _1q8tSL']/div["+i+"]/div["+j+"]/div/a[2]";
				
				WebElement contentEle=driver.findElement(By.xpath(xpathProductName));
				
				System.out.println(contentEle.getText().toString());			
				}
			System.out.println("========================================");
		}
		
		
		
				
		
	}

}
