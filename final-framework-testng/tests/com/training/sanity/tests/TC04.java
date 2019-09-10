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
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC04 {
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
				public void AddPropertyTest() {
					Assignment2POM.CLickLoginLink();
					Assignment2POM.EnterUsername("admin");
					Assignment2POM.EnterPassword("adminuser@12345");
					Assignment2POM.submitloginbtn();
			// Logged as admin
					
					Assignment2POM.Propertieshovered();
					Assignment2POM.AddnewPropertyClick();
					Assignment2POM.EnterTitlevalue("IBM Testing1211");
					Assignment2POM.EnterbodyValue1("IBM Testing1211");
					
				
					Assignment2POM.featuredcheckboxclick();
					Assignment2POM.Regionscheckboxclick();
					   
					//Assignment2POM.Publishbottonclick();
					//Assignment2POM.Publishbottonclick();
					
					WebElement Publish = driver.findElement(By.id("publish"));
					   Actions act = new Actions(driver);
					   Action mouseover = act.moveToElement(Publish).click().build();
					   mouseover.perform();
					   Publish.click();
					   
					   
					
					System.out.println("pulished");
					
					   /*String ActualText=driver.findElement(By.xpath("//*//*[@id='posts-filter']/div[1]/div[2]/span[1]")).getText();
					   String ExpectedText = "1 item";
					   Assert.assertEquals(ActualText,ExpectedText);
					   System.out.println("Test Case Passed3");*/
					   
					   
}
	}
