import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/tables");
		
		System.out.println("Page Tittle  : "+driver.getTitle());
		
		WebElement header = driver.findElement(By.xpath("//table[@id='sortableTable')/thead/tr/th"));
		
		System.out.println("No of Coloumns : "+header.getSize());
		
		WebElement row = driver.findElement(By.xpath("//table[@id='sorttableTable')/tbody/tr"));
		
		System.out.println("No of Rows : "+row.getSize());
		
		WebElement cellvalueBefore = driver.findElement(By.xpath("//table[@id='sorttableTable')/tbody/tr[2]/td[2]"));
		
		System.out.println("Printing Second Row Second before sorting  : "+cellvalueBefore.getText());
		
		
		driver.findElement(By.xpath("//table[@id='sorttableTable')/thead/tr/th[1]")).click();
		
		
WebElement cellvalueAfter = driver.findElement(By.xpath("//table[@id='sorttableTable')/tbody/tr[2]/td[2]"));
		
		System.out.println("Printing Second Row Second coloumn after sorting : "+cellvalueAfter.getText());
		
		
		 WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));

	        System.out.println("Table footer values: " + footer.getText());
		
			
			
		driver.close();
		
		
	}

}
