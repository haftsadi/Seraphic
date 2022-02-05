package Hello;

import java.net.http.HttpClient;
import java.rmi.UnexpectedException;
import java.security.PublicKey;
import java.sql.Driver;
import java.util.List;
import java.util.NoSuchElementException;

import javax.security.auth.login.AccountNotFoundException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Hello {


	public static void main(String[] args) throws InterruptedException {

		/*Google*/

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PEREZHAFTSADI\\Desktop\\SELENIUM\\WEB DRIVER\\97chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/**/
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		/*Maximize the screen*/
		driver.manage().window().maximize(); 
		/*Zoom Out the screen*/

		Thread.sleep(10000);
		
		/*Click on Google Search bar aand type JavaScript*/
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("<script>alert(‘<Any message we want>’)</script>" + "\n");
		
		
		/* Check for Popup */ 
		
		WebDriverWait wait = new WebDriverWait(driver, 3 /*timeout in seconds*/);
        if(wait.until(ExpectedConditions.alertIsPresent())==null){
              System.out.println("alert was not present");
        }
        else
        {
         Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("alert was present and accepted");
        }
		
		/* Close browser*/ 
		driver.quit();
		
	}
		


	}


