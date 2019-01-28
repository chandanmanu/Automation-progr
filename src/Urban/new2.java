package Urban;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class new2 {

	public static void main(String[] args)throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/chromedriver");
			

			
			
			//WebDriver driver1=new FirefoxDriver();
			WebDriver driver=new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
			Thread.sleep(2000);
			List<WebElement> outerList=driver.findElements(By.id("//div[@id='block_top_menu']"));
			//WebElement sales=driver.findElement(By.xpath("//li/span[contains(text(),'Sale')]"));
			Actions actions=new Actions(driver);
			for(WebElement newOuterList:outerList)
			{
			actions.moveToElement(newOuterList).perform();
			
			System.out.println(newOuterList.getText());
			Thread.sleep(2000);
			//div[@id='block_top_menu']/ul[@ class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//a
			List<WebElement> lst=driver.findElements(By.xpath("(//div[@id='block_top_menu']/ul[@ class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//a)"));
			System.out.println(lst.size());
			for(WebElement salelist:lst)
			{
			System.out.println(salelist.getText());
			}
			}
			//driver.close();

			}

			


	

	


	}


