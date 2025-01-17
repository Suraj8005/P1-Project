package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
	    Thread.sleep(2000);	
	    
	    System.out.println("webdriverLaunchedSucessfully");
	    
			
		}

	}

