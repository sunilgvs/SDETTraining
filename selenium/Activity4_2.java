import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		System.out.println("Page Tittle  : "+driver.getTitle());
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));	
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		
		firstName.sendKeys("Sunil");
		lastName.sendKeys("Gadamsetty");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("gvssunilkumar@gmail.com");
		driver.findElement(By.xpath("//*[@id='number']")).sendKeys("8790515177");
		
		driver.findElement(By.xpath("//textarea")).sendKeys("My Text ");

		driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
		
		System.out.println("Submit Done ");
		
		driver.quit();	

	}

}
