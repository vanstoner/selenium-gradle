

package XlReleaseLogin;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import junit.framework.JUnit4TestAdapter;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class XlReleaseLogin {
	
	private static FirefoxDriver driver;	
 	
 	@BeforeClass
	public static void openBrowser(){
 		driver = new FirefoxDriver();
 		driver.get("http://localhost:5516");
 		WebDriverWait wait1 = new WebDriverWait(driver, 15);
	    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputLogin")));
		} 
 	 
	@Test
	public void Step1XlReleaseLogin() {
		
		   String expectedTitle = "XL Release";
	       String actualTitle = driver.getTitle();
	       Assert.assertEquals(expectedTitle,actualTitle);
	       WebElement element = driver.findElement(By.id("inputLogin"));
	       element.sendKeys("admin");
	       
	       WebElement element1 = driver.findElement(By.id("inputPassword"));
	       element1.sendKeys("admin");
	       element1.submit();
	       
	       WebDriverWait wait = new WebDriverWait(driver, 15);
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchFilter")));
	       

	    /*		   
	   	<td>waitForElementPresent</td>
	   	<td>id=searchFilter</td>
	   	<td></td>
	   </tr>
	   <tr>
	   	<td>click</td>
	   	<td>//div[2]/span[2]</td>
	   	<td></td>
	   </tr>
	   <tr>
	   	<td>click</td>
	   	<td>link=Logout</td>
	   	<td></td>
*/	       
	//close the web browser
	       driver.close();
	}
	
	@Test
	public void Step2XlReleaseHelpAbout() {
		
		WebElement element = driver.findElement(By.xpath("//div[2]/span[2]"));
		element.click();
		WebElement element1 = driver.findElement(By.xpath("//div[@id='actions-container']/ul[3]/li"));
		element1.click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
	   // driver.findElement(By.("css=p.brand &gt; img.logo")));
	    
	       
	       driver.close();
	}

	
	 @AfterClass
	 public static void closeBrowser(){
		 driver.quit();
	 }
}











 
