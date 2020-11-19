import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity7_2 {
	
	//Create a Class and a main() method

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create a WebDriver instance, named driver, with the FirefoxDriver().
		WebDriver driver = new FirefoxDriver();
		
		
		//Open the browser with https://training-support.net/selenium/selects using the get() method.
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement chosen = driver.findElement(By.id("multi-value"));
		
		//Use findElement() to find the multi-select WebElement on the page.
		Select multiselect = new Select(driver.findElement(By.id("multi-select")));
		
		
		//Check if the HTML element is a multi-list. Proceed with other actions if it is.
		if (multiselect.isMultiple()) {
		
		//Select the 'JavaScript' option by visible text.
		multiselect.selectByVisibleText("Javascript");
		System.out.println(chosen.getText());
		
		//Select the 'NodeJS' option by value.
		multiselect.selectByValue("node");
		System.out.println(chosen.getText());
		//Select the 4th, 5th, and the 6th options by index.
		for (int i=4; i<=6; i++) {
			 multiselect.selectByIndex(i);
			
		}
		
		//Deselect the 'NodeJS' option by value attribute.
		
		multiselect.deselectByValue("node");
		System.out.println(chosen.getText());
		//Deselect the 7th option by index.
		multiselect.selectByIndex(7);
		System.out.println(chosen.getText());
		//Print the first selected option.
		System.out.println(multiselect.getFirstSelectedOption().getText());
		
		
		List<WebElement> selectedopitons = multiselect.getAllSelectedOptions();
		
		for (WebElement firstselectedoption : selectedopitons) {
			
			System.out.println("Printing First Selected Options from the List " +firstselectedoption.getText());
			
		}
		
		
		//Print all selected options one by one and deselect all options.
		
		multiselect.deselectAll();
		System.out.println(chosen.getText());
		}
		
	}

}
