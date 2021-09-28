package practise_01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Add_Nationalities {
	WebDriver driver;
	
	public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
  @Test
  public void Add_Nationalitie() throws Exception  {
	  
	  Add_Nationalities N1 = new Add_Nationalities();
	  
	  N1.OpenChromeBrowser();
	  N1.OpenOrangeHRMURL();
	  N1.Login();
	  N1.AddNationalities();
	  
	  
		  
		  
  }
  
  
  public void OpenChromeBrowser() throws Exception  {
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
	    
  }
  
  public void OpenOrangeHRMURL() throws Exception  {
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
  }
  
  
  
  public void Login() throws Exception  {
	  
	    findElement(By.id("txtUsername")).sendKeys("Admin");
		findElement(By.id("txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();
  }
  
  
  public void AddNationalities() throws Exception  {
	  
	  findElement(By.id("menu_admin_viewAdminModule")).click();
	  findElement(By.id("menu_admin_nationality")).click();
	  findElement(By.id("btnAdd")).click();
	  findElement(By.id("nationality_name")).sendKeys("Indian");
	  findElement(By.id("btnSave")).click();
	  
	
  }
  
  
  
  
  
  
  
  
}