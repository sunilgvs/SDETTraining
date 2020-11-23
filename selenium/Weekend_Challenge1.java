import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Weekend_Challenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.google.com");
		
		
		
		WebElement txt = driver.findElement(By.name("q"));
		
		txt.sendKeys("Cheese");
		txt.submit();
		
		WebElement resultcount = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("result-stats")));
				
		
		System.out.println("Search Results for Google Search : " +resultcount.getText());
		
		WebElement count = driver.findElement(By.xpath("//*[@id='rso']"));
		
		
		
		

	}

}
