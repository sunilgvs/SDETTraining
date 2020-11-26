import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		driver.findElement(By.cssSelector("button#prompt")).click();
		
		Alert clickprompt = driver.switchTo().alert();
		
		String AlertText = clickprompt.getText();
		System.out.println("Alert Text is  "+ AlertText );
		
		clickprompt.sendKeys("sunil");
		
		clickprompt.accept();
		
		driver.close();
				
		

	}

}
