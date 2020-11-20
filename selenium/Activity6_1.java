import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/tables");
		
		System.out.println("Page Tittle  : "+driver.getTitle());
		
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='sortableTable']/thead/tr/th[1]"));
		
		System.out.println("No of Coloumns : "+ cols.size());
		
List<WebElement> rows = driver.findElements(By.xpath("//*[@id='sortableTable']/tbody/tr"));
		
		System.out.println("No of Rows : "+ rows.size());
		
		List<WebElement> thirdRow = driver.findElements(By.xpath("//*[@id='sortableTable']/tbody/tr[3]/td"));
		
		for(WebElement rowlist : thirdRow) {
			
			System.out.println("Third Row Values  : "+ rowlist.getText() );
						
		}
		
		WebElement secondrow = driver.findElement(By.xpath("//*[@id='sortableTable']/tbody/tr[2]/td[2]"));
		
		System.out.println("Second Row Second Coloumn Value :"+ secondrow.getText() );
			
		driver.close();
		
		
	}

}
