package finalpack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//Project 4
//Add a new employee
//Goal: Add an employee and their details to the site

public class Activity_F4 {
	
	 
	  
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		public class TestCases {
			
		}
		    @Test
		    public void newemployee() throws InterruptedException {

		    	 WebDriver driver = new FirefoxDriver();
		        driver.manage().window().maximize();
		        driver.get("http://alchemy.hguy.co/orangehrm");
		        LoginPage login = new LoginPage(driver);
		        login.typeusername();
		        login.typepassword();
		        login.ClickOnLoginbutton();
		        driver.findElement(By.xpath("//b[contains(.,'PIM')]")).click();
		        driver.findElement(By.xpath("//a[contains(.,'Employee List')]")).click();
		        
		        Thread.sleep(3000);
		        driver.findElement(By.name("btnAdd")).click();
		        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Test");
		        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Data4");
		        driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).click();
		        driver.findElement(By.xpath("//input[contains(@name,'user_name')]")).sendKeys("TestData4");
		        driver.findElement(By.xpath("//input[@value='Save']")).click();
		        driver.findElement(By.xpath("//b[contains(.,'Admin')]")).click();
		        driver.findElement(By.xpath("//input[contains(@class,'input')]")).sendKeys("Test Data4");
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//input[@value='Search']")).click();
		        
		        driver.close();
		        
		    

	}

}
