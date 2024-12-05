package mypackage;

import org.openqa.selenium.WebDriver;//Interface representing the Selenium WebDriver, which controls the browser.
import org.openqa.selenium.chrome.ChromeDriver;// A specific implementation of WebDriver for controlling Google Chrome.

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException { //Ensures that if Thread.sleep() throws an exception, it is handled appropriately.
		
		// Initialize the WebDriver
		WebDriver driver = new ChromeDriver();//Creates an instance of ChromeDriver, which opens a Chrome browser.
		
		// Navigate to google
		driver.get("https://www.google.com");//Navigates to the specified URL (Google in this case).
		
		//Maximize the browser
		 driver.manage().window().maximize();

        // Print page title
        System.out.println("Page title is: " + driver.getTitle());
        
        // Wait for 5 seconds(5000 milliseconds)
        Thread.sleep(5000);


        // Close the browser
        driver.quit();
		
	}

}
