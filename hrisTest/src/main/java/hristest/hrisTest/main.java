package hristest.hrisTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
	 WebDriver driver = new ChromeDriver();
	 
	 public void OpenHRIS() {
		 driver.get("https://hris.qainfotech.com/login.php");
	    
	 }
	 
	
	 public String URL() {
			return driver.getCurrentUrl();
		}
	 
	 public void login(String userName, String password)  {
	 driver.findElement(By.className("active")).click();
     driver.findElement(By.id("txtUserName")).sendKeys(userName);
     driver.findElement(By.id("txtPassword")).sendKeys(password);
     driver.findElement(By.xpath("//input[@name='Submit']")).click();
       
	  }
	 
	 public void timesheet(String string) throws InterruptedException
	 {    
		 Thread.sleep(3000);
		 System.out.println(driver.findElement(By.xpath("//*[text()="+string+"]/../div/div[2]/p/span")).getText());	     
	 }
	 
	 
	 public void logout() throws InterruptedException 
	 {
		 driver.findElement(By.xpath("//img[@class='user-image']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[text()='Logout']")).click();
		 
	 }

	 }
	 