import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		
		System.out.println("Page Tittle  : "+driver.getTitle());
		
		WebElement checkboxinput = driver.findElement(By.xpath("//input[contains(@type, 'checkbox')]"));
		
		boolean verifydisabled = checkboxinput.isDisplayed();
		
		System.out.println("Before Remove Check Box " + verifydisabled );
		
		driver.findElement(By.xpath("//button[contains(text(),'Remove checkbox')]")).click();
		
		//WebElement checkboxinputr = driver.findElement(By.xpath("//input[contains(@type, 'checkbox')]"));
		
		boolean verifyenabled = checkboxinput.isDisplayed();
		
		System.out.println("After Remove Check Box " + verifyenabled );
		
		
		driver.close();
		
		
		
	}

}
