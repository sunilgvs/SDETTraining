import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);		
		
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
		System.out.println("Page Title is  : "+driver.getTitle());
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[starts-with(@class,'username-')]")));
		
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@class,'username-')]"));
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@class,'password-')]"));
		
		
		username.sendKeys("admin");
		password.sendKeys("password");
		
		WebElement login = driver.findElement(By.xpath("//button[starts-with(@class,'ui button')]"));
		
		login.click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"), "Welcome Back, admin"));
		
		String welcometxt = driver.findElement(By.id("action-confirmation")).getText();
		
		System.out.println(welcometxt);
		
		driver.close();
	}

}
