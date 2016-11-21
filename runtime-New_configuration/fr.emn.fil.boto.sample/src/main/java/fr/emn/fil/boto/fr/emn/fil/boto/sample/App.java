package fr.emn.fil.boto.fr.emn.fil.boto.sample;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws InterruptedException {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.gecko.driver", new File("C:\\Dev\\_soft\\selenium\\geckodriver.exe").getAbsolutePath());
        WebDriver driver = new FirefoxDriver();
        driver.get("https://campusneo.mines-nantes.fr/campus/");
        
        
        WebElement element = driver.findElement(By.linkText("Connexion"));
        element.click();

        
        
        Thread.sleep(1000);
        element = driver.findElement(By.cssSelector("input[value=\"Cliquez ici ou sur le logo C'zam pour vous identifier\"]"));
        element.click();

        Thread.sleep(1000);
        
        Select a = new Select(driver.findElement(By.name("user_idp")));
        a.deselectAll();
        a.selectByVisibleText("Ecole des Mines de Nantes");
        
        element = driver.findElement(By.cssSelector("input[value=\"Cliquez ici pour continuer\"]"));
        element.click();
        
        Thread.sleep(1000);
        
        element = driver.findElement(By.name("username"));
        element.sendKeys("alebru14");
        element = driver.findElement(By.name("password"));
        element.sendKeys("XelAXelA");
        element = driver.findElement(By.name("warn"));
        element.click();
        
        
        element = driver.findElement(By.linkText("Connexion"));
        element.click();
        
        
        Thread.sleep(5000);
        System.out.println("Page title: " + driver.getTitle());
        driver.quit();
    }
}