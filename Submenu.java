package Chanda;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submenu {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
		//List <WebElement> mainmenu=driver.findElements(By.id("//div[@id='block_top_menu']"));
		//System.out.println(mainmenu);
		
		
		
		//div[@id='block_top_menu']/ul[@ class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//a
		

	}

}
