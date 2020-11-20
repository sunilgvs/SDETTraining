import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);		
		
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
		System.out.println("Page Title is  : "+driver.getTitle());
		
		//driver.findElement(By.xpath("//div[@class,'content']"));
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
		WebElement confirmpwd = driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input"));
		WebElement email = driver.findElement(By.xpath("//input[starts-with(@class,'email')]"));
		
		username.sendKeys("admin");
		password.sendKeys("password");
		confirmpwd.sendKeys("password");
		email.sendKeys("1@gmail.com");
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		
		WebElement status = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='action-confirmation']")));
		
		System.out.println("Signup is Success with Message "+status.getText());
		
		driver.close();
		
		
		
		
		
		
		


	}

}
