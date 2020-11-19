import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebElement element;
		
		
		driver = new FirefoxDriver();
		
		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
			
		System.out.println("Printing Page Title : "+driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']//input"));
		
		WebElement checkboxtoggle = driver.findElement(By.xpath("//button[@id ='toggleCheckbox']"));
		
		checkboxtoggle.click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		
		checkboxtoggle.click();
		
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
