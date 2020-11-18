import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		
		System.out.println("Page Tittle  : "+driver.getTitle());
		
		WebElement checkboxinput = driver.findElement(By.xpath("//input[contains(@type, 'checkbox')]"));
		
				
		System.out.println("Check if checkbox is selected " + checkboxinput.isSelected());
		
		
		checkboxinput.click();
		
		System.out.println("Check if checkbox is selected " + checkboxinput.isSelected());		
		
		driver.close();
		
		
		
		
	}

}
