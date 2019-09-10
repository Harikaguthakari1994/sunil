package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC02 {
	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.TC01POM TC01POM;
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
		TC01POM = new com.training.pom.TC01POM(driver); 
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
			TC01POM.CLickLoginLink();
			TC01POM.EnterUsername("admin");
			TC01POM.EnterPassword("adminuser@123");
			TC01POM.submitloginbtn();
			WebElement Post = driver.findElement(By.xpath("//div[@class='wp-menu-image dashicons-before dashicons-admin-post']"));
			 Actions act = new Actions(driver);
			   Action mouseover = act.moveToElement(Post).build();
			   mouseover.perform();
			   System.out.println("Performed first Mousehover");
			   TC01POM.MenuPostClick();
			   TC01POM.EnterTitlevalue("TestingIBM");
			   TC01POM.EnterbodyValue1("TESTING");
			   TC01POM.Publishclick1();
			   String ActualResult = driver.findElement(By.xpath("//*[@id='message']/p")).getText();
			      String ExpectedResult = "Post published. View post";
			      Assert.assertEquals(ActualResult,ExpectedResult);
			     System.out.println("Test Passed2");
			   
			   

}}
