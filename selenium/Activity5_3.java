import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		
		System.out.println("Page Tittle  : "+driver.getTitle());
		
		WebElement textenabled = driver.findElement(By.xpath("//input[contains(@type, 'text')]"));
				
		
		System.out.println("Check Text box is enabled to text " + textenabled.isEnabled());
		
		WebElement buttonenabled = driver.findElement(By.xpath("//button[@id=\"toggleInput\"]"));
		
		buttonenabled.click();
		
		System.out.println("Check Text box is enabled to text " + textenabled.isEnabled());
		
		driver.close();
		
		
		
	}

}
