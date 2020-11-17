import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Activity1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
	   WebDriver driver = new FirefoxDriver();
	   
	   String url = "https://www.training-support.net/selenium/simple-form";
	   
	   driver.get(url);
	   
	   System.out.println(url);
	   Thread.sleep(1000);
	   //driver.close();;
		   
		
	}

}
