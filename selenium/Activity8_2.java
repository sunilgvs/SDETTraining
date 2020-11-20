import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://www.training-support.net/selenium/ajax");
		
		System.out.println("Title of the page  is  :"+driver.getTitle());
		
		WebElement changecontent = driver.findElement(By.xpath("//button[contains(@class,'violet')]"));
		
		changecontent.click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		
		String ajaxtxt = driver.findElement(By.id("ajax-content")).getText();
		
		System.out.println(ajaxtxt);
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		
		String latetxt = driver.findElement(By.id("ajax-content")).getText();
		
		System.out.println(latetxt);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
