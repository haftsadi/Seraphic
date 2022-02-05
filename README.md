# Seraphic
package Hello;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		
		Thread.sleep(2000);
		
		/*Click on Google Search bar aand type JavaScript*/
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("<script>alert(‘<Any message we want>’)</script>" + "\n");
		Thread.sleep(2000);
		
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
