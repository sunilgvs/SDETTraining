import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://training-support.net/selenium/drag-drop");
		
		driver.getTitle();
		
		WebElement ball = driver.findElement(By.id("draggable"));
		WebElement drop1 = driver.findElement(By.id("droppable"));
		WebElement drop2 = driver.findElement(By.id("dropzone2"));
		
		Actions draganddrop = new Actions(driver);
		
		draganddrop.dragAndDrop(ball, drop1).build().perform();

		wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1, "background-color"));
		
		System.out.println("Entered Drop Zone 1 ");
		
		draganddrop.dragAndDrop(ball, drop2).build().perform();

		wait.until(ExpectedConditions.attributeToBeNotEmpty(drop2, "background-color"));
		
		System.out.println("Entered Drop Zone 2 ");
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
