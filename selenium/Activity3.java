import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		String tittle = driver.getTitle();
		System.out.println("Printing the Tittle : " +tittle);
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		WebElement lastname = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement contact = driver.findElement(By.id("number"));
		
		firstname.sendKeys("Sunil");
		lastname.sendKeys("Gadamsetty");
		email.sendKeys("gvssunilkumar@gmail.com");
		contact.sendKeys("8790515177");
		
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		
		driver.close();

	}

}
