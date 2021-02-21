package Test;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingdiffrentURLs {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("Webdriver.chrome.driver", "Chromedriver.com");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.snapdeal.com/");
		driver.navigate().to("https://www.snapdeal.com/");
		Thread.sleep(5000);
		System.out.println("First tab opration"+driver.getTitle());
		
		
		
		Set<String> list=driver.getWindowHandles();
		System.out.println("size of set"+list.size());
		Iterator<String> itr=list.iterator();
		
		String parentwindow=itr.next();
		System.out.println(parentwindow);
		System.out.println(itr.hasNext());
		String childwindow1=itr.next();
		System.out.println(childwindow1);
		
		driver.switchTo().window(childwindow1);
		driver.navigate().to("http://www.flipkart.com");
		//driver.get("http://www.flipkart.com");
		//driver.getTitle();
		System.out.println("current window is :"+ driver.getWindowHandle());
		
		//driver.quit();
		
	}
	

}
