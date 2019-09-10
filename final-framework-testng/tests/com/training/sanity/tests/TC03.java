package com.training.sanity.tests;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Assignment2POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC03 {
	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.Assignment2POM Assignment2POM;
	private static Properties properties;
	private ScreenShot screenShot;
	

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Assignment2POM = new com.training.pom.Assignment2POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
		//@AfterMethod
				//public void tearDown() throws Exception {
					//Thread.sleep(1000);
					//driver.quit();

				//}
				@Test
				public void validLoginTest() {
					Assignment2POM.CLickLoginLink();
					Assignment2POM.EnterUsername("admin");
					Assignment2POM.EnterPassword("adminuser@123");
					Assignment2POM.submitloginbtn();
					WebElement Post = driver.findElement(By.xpath("//div[@class='wp-menu-image dashicons-before dashicons-admin-post']"));
					 Actions act = new Actions(driver);
					   Action mouseover = act.moveToElement(Post).build();
					   mouseover.perform();
					   System.out.println("Performed first Mousehover");
					   TC01POM.Categoriesclick();
					   TC01POM.EnterCategoryname("IBM Testing121");
					   TC01POM.EnterCategoryslug("IBM Testing121");
					   Select dropdown = new Select(driver.findElement(By.id("parent")));  
					   dropdown.selectByVisibleText("apple");
					   TC01POM.EnterCategorydescription("IBM Testing121");
					   TC01POM.Categorysumitclick();
					   TC01POM.Entertagsearchinput("IBM Testing121");
					   TC01POM.Categorysearchsubmitclick();
					   String ActualText=driver.findElement(By.xpath("//*//*[@id='posts-filter']/div[1]/div[2]/span[1]")).getText();
					   String ExpectedText = "1 item";
					   Assert.assertEquals(ActualText,ExpectedText);
					   System.out.println("Test Case Passed3");
					   
					   
}
	}
