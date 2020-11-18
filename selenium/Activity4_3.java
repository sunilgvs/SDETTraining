import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.training-support.net/selenium/target-practice");
		
		System.out.println("Page Tittle  : "+driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='third-header']")).getText();
		
		String color = driver.findElement(By.xpath("//*[contains(@class, 'green')]")).getCssValue("color");
						
		System.out.println("Fifth Header COlor is : " + color);
		
		String voilet = driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
		
		System.out.println(" button  of class is  : " + voilet);
		
		String grey = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		
		System.out.println("The Grey button text is " + grey);
		
		
		driver.close();
		
		
		
		
	}

}
