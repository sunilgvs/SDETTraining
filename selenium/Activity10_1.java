import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		Actions action = new Actions(driver);
		
		
		driver.get("https://www.training-support.net/selenium/input-events");
		
		System.out.println(driver.getTitle());
		
		
		WebElement element = driver.findElement(By.id("wrapD3Cube"));
		
		action.click(element);
		WebElement leftclick = driver.findElement(By.className("active"));
		System.out.println("Left Click action and active Number  :"+leftclick.getText());
		
		action.doubleClick(element).perform();
		WebElement doubleclick = driver.findElement(By.className("active"));
		System.out.println("Double Click action and active Number  :"+doubleclick.getText());
		
		action.contextClick(element).perform();
		WebElement contextClick = driver.findElement(By.className("active"));
		System.out.println("Context Click action and active Number  :"+contextClick.getText());
		
		driver.close();
		
		
		
		

	}

}
