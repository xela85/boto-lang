package fr.emn.fil.boto.sample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
    
public static void main( String[] args ) throws InterruptedException {
		    	System.setProperty("webdriver.gecko.driver", "C:\\Dev\\_soft\\selenium\\geckodriver.exe");
		    	System.setProperty("webdriver.chrome.driver", "C:\\Dev\\_soft\\selenium\\chromedriver.exe");
		    	WebDriver driver;
driver =  new FirefoxDriver(); 
driver.get("https://www.google.fr");
Thread.sleep(1000);
driver.findElement(By.name("q")).sendKeys("J'aime les patates");
Thread.sleep(1000);
Object request = driver.findElement(By.linkText("J'aime les patates"))
;
Thread.sleep(1000);
((WebElement) request).click();
	}
}