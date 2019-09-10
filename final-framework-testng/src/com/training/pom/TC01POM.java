package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC01POM {
	public WebDriver driver;
	//Actions act = new Actions(driver);
	
	public TC01POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class ='sign-in']")
	public WebElement LoginLink1;
	
	public void CLickLoginLink(){
		this.LoginLink1.click();
	}
	
	@FindBy(id="user_login")
	public WebElement UN;
	
	public void EnterUsername(String username){
		this.UN.sendKeys(username);
	}
	@FindBy(id="user_pass")
	public WebElement PW;
	
	public void EnterPassword(String password){
		this.PW.sendKeys(password);
	}
	@FindBy(name="login")
	public WebElement submitLoginclick;
	
	public void submitloginbtn(){
		this.submitLoginclick.click();
	}
	

	@FindBy(xpath="//a[contains(text(),'Posts')]")
	public WebElement Posts;
	
	public void PostClick(){
		this.Posts.click();
	}
	@FindBy(xpath="//*//*[@id='post-4553']/td[1]/div[3]/span[3]/a")
	public WebElement Trash;
	
	public void TrashClick(){
		this.Trash.click();
	}
	@FindBy(xpath="//a[contains(text(),'Undo')]")
	public WebElement Undo;
	
	public void Undovalidation(){
		this.Undo.isDisplayed();
	}
	@FindBy(xpath="//a[contains(text(),'Undo')]")
	public WebElement Undolink;
	
	public void Undoclick(){
		this.Undolink.isDisplayed();
	}
	@FindBy(xpath="//*[@id='menu-posts']/ul/li[3]/a")
	public WebElement MenuPosts;
	
	public void MenuPostClick(){
		this.MenuPosts.click();
		
	}
	@FindBy(name="post_title")
	public WebElement EnterTitle;
	
	public void EnterTitlevalue(String Titlevalue ){
		this.EnterTitle.sendKeys(Titlevalue);
		
	}
	@FindBy(id="content")
	public WebElement Enterbody1;
	
	public void EnterbodyValue1(String bodyvalue ){
		this.Enterbody1.sendKeys(bodyvalue);
		
	}
	
	@FindBy(xpath="//*[@name='publish']")
	public WebElement Publish1;
	
	public void Publishclick1(){
		this.Publish1.click();
		
	}
	
	@FindBy(xpath="//*[@id='menu-posts']/ul/li[4]/a")
	public WebElement Categories;
	
	public void Categoriesclick(){
		this.Categories.click();
		
	}
	@FindBy(name="tag-name")
	public WebElement Categoryname;
	
	public void EnterCategoryname(String categoryname ){
		this.Categoryname.sendKeys(categoryname);
		
	}
	@FindBy(id="tag-slug")
	public WebElement Categoryslug;
	
	public void EnterCategoryslug(String categoryname ){
		this.Categoryslug.sendKeys(categoryname);
		
	}
	
	@FindBy(id="tag-description")
	public WebElement Categorydescription;
	
	public void EnterCategorydescription(String categoryname ){
		this.Categorydescription.sendKeys(categoryname);
		
	}
	@FindBy(xpath="//*[@id='submit']")
	public WebElement Categorysubmit;
	
	public void Categorysumitclick(){
		this.Categorysubmit.click();
		
	}
	@FindBy(id="tag-search-input")
	public WebElement tagsearchinput;
	
	public void Entertagsearchinput(String categoryname ){
		this.tagsearchinput.sendKeys(categoryname);
	}
		@FindBy(xpath="//*[@id='search-submit']")
		public WebElement Categorysearchsubmit;
		
		public void Categorysearchsubmitclick(){
			this.Categorysearchsubmit.click();
			
		}	
		
		@FindBy(xpath="//tr[@id='post-4553']")
		public WebElement AllPostshover;
		
		public void  AllPosthovered(){
			Actions act1 = new Actions(driver);
			act1.moveToElement(AllPostshover).build().perform();
			
			
		}	
		
	
	

	
}
