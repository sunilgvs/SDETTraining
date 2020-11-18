import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net");
		
		System.out.println("Page Tittle  : "+driver.getTitle());
		
		WebElement xpathclick = driver.findElement(By.xpath("//*[@id='about-link']"));
		
		xpathclick.click();
		
		System.out.println("About Us Tittle  : "+driver.getTitle());
		
		
		
		
		

	}

}
