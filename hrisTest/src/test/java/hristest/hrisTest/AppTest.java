package hristest.hrisTest;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class AppTest extends main{
	
	
  @Test(priority=1)
  public void Testopenhris() {
	  OpenHRIS();
	  Assert.assertTrue(URL().contains("hris.qainfotech"));
  }
  
  @Test(priority=2)
  public void Testthecorrectlogin() throws InterruptedException {
	  login("sudhanshu.kumar", "Sudhanshu@321#");
	  Assert.assertTrue(URL().contains("timesheet"));
	  logout();
  }
  
  @Test(priority=3)
  public void Testthecorrectusernameandpassword() {
	  login("sudhanshukumar", "Sudhanshu@321");
	  Assert.assertTrue(URL().contains("login.php"));
	
  }
  
  @Test(priority=4)
public void Testblankusernameandpassword() {
	  login("", "");
	  Assert.assertTrue(URL().contains("login.php"));
  }
  
  @Test(priority=5)
  public void Testblankusername_correctpassword() {
	  login("", "Sudhanshu@321");
	  Assert.assertFalse(URL().contains("timesheet"));
	
  }
  
  @Test(priority=6)
  public void Testblankpassword_correctusername() {
	  login("sudhanshu.kumar","");
	  Assert.assertFalse(URL().contains("timesheet"));
	
  }
  
  
  @AfterClass
	public void browserQuit() {
		driver.quit();
	}
}