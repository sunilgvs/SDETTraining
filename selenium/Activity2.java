import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net");
		
		String tittle = driver.getTitle();
		System.out.println("Tittle of the Page is  :" + tittle);
		
		WebElement idlocator = driver.findElement(By.id("about-link"));
		System.out.println("Printing Id Text " + idlocator.getText() );
		
		WebElement csslocator = driver.findElement(By.cssSelector(".green"));
		System.out.println("Printing css Text " + csslocator.getText() );
		
		WebElement classlocator = driver.findElement(By.className("green"));
		System.out.println("Printing Class Text " + classlocator.getText() );
		
		
		WebElement linktest = driver.findElement(By.linkText("About Us"));
		System.out.println("Printing link Text " + linktest.getText() );
		
		driver.close();
		

	}

}
