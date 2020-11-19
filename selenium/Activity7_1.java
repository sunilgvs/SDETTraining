import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		
		driver.get("https://training-support.net/selenium/selects ");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("single-value")));
		
		WebElement chosen = driver.findElement(By.id("single-value"));
		
		Select dropdown = new Select (driver.findElement(By.id("single-select")));
		
		//Select options = new Select(dropdown);
		
		//Select the second option using selectByVisibleText()
		
		dropdown.selectByVisibleText("Option 2");
		System.out.println(chosen.getText());
		
		//Select the third option using selectByIndex()
		
		dropdown.selectByIndex(3);
		System.out.println(chosen.getText());
		
		//Select the fourth option using selectByValue()
		
		dropdown.selectByValue("4");
		System.out.println(chosen.getText());
		
		
		List<WebElement> options = dropdown.getOptions();
		
		for(WebElement option : options) {
			System.out.println("Printing all opitons from the List  "+option.getText());
		}
		
		driver.close();
		
		
	
	
		
		
		
	}

}
