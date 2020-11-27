package TestNGproject;


import org.testng.annotations.Test;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
//import org.openqa.selenium.interactions.Actions;

public class Activity2 {
	
	WebDriver driver;
	
	
	  @Test
	  public void NaviColor() throws InterruptedException {
		  WebElement username = driver.findElement(By.id("user_name"));
		  WebDriverWait wait = new WebDriverWait(driver,50);
		  WebElement password =  driver.findElement(By.id("username_password"));
		  username.sendKeys("admin");
		  password.sendKeys("pa$$w0rd");
		  driver.findElement(By.id("bigbutton")).click();
	
		  //Ativity5 - Get the color of the navigation menu
		  
		//  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("desktop-toolbar")));
		//  WebElement navicol = driver.findElement(By.className("desktop-toolbar"));
		//  System.out.println("Color of the navigation toolbar is " +navicol.getCssValue("color"));
		  
		//Activity6 - Make sure that the “Activities” menu item exists and is clickable
		  
		 // String Activities = driver.findElement(By.id("grouptab_3")).getText();
		//  Assert.assertEquals("ACTIVITIES", Activities);
		 
		  
		//  Actions action = new Actions(driver);
		
		WebElement sales = driver.findElement(By.id("grouptab_0"));	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grouptab_0")));
		sales.click();
		
        WebElement leads = driver.findElement(By.id("moduleTab_9_Leads"));
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("moduleTab_9_Leads")));
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("moduleTab_9_Leads")));
	    leads.click();
	   
	   // Thread.sleep(7000);
		 
				
	//Activity7	
		WebElement addinfo1 = driver.findElement(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr[1]/td[10]//following-sibling::span"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr[1]/td[10]//following-sibling::span")));
		addinfo1.click();
		
		//Find Mobile number element
		WebElement MobileNo = driver.findElement(By.xpath("//*[@id='content']//span[@class='phone']"));
		wait.until(ExpectedConditions.visibilityOf(MobileNo));
		 System.out.println("Mobile No is : " + MobileNo.getText());
	
	  }
	 
		 
		
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/crm");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	 // driver.quit();
  }

}
