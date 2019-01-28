
public class Dummy {

	public static void main(String[] args) {
		
		
		List<WebElement> outerList = driver.findElements(By.xpath("//span[@class='topnav_itemname']"));

		// WebElement
		// sales=driver.findElement(By.xpath("//li/span[contains(text(),'Sale')]"));

		Actions actions = new Actions(driver);

		int row = 0;
		for (int i = 0; i < outerList.size(); i++)

		{
			WebElement mainMenu = outerList.get(i);

			actions.moveToElement(mainMenu).perform();
			System.out.println(mainMenu.getText());
			String v = mainMenu.getText();
			//Assert.assertEquals(readFromXl(row,0),v);
	writeToXl(row, v);

	
	row++;

			Thread.sleep(50);

			//List<WebElement> lst = driver.findElements(By.xpath("(//div[@class='subnavlist_wrapper clearfix'])"));
			List<WebElement> lst = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li/span[contains(text(),'"+mainMenu.getText()+"')]/../div//a"));

			// System.out.println(lst.size());

			for (int j = 0; j < lst.size(); j++) {
				WebElement submenu = lst.get(j);
				//System.out.println(submenu.getText());
				String v1 = submenu.getText();
				//Thread.sleep(5000);
				System.out.println(v1);
				//Assert.assertEquals(readFromXl(row,0),v1);

				Day2_excel.writeToXl(row++, v1);
	}

}
