package finalpack;


//Project 5
//Edit user information
//Goal: Edit a user’s information

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity_F5 {

	
	


		@Test
		public void userinformation() throws InterruptedException {

			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://alchemy.hguy.co/orangehrm");

			LoginPage login = new LoginPage(driver);

			login.typeusername();
			login.typepassword();
			login.ClickOnLoginbutton();

			driver.findElement(By.xpath("//b[contains(.,'My Info')]")).click();

			Thread.sleep(3000);

			driver.findElement(By.xpath("//input[contains(@value,'Edit')]")).click();

			driver.findElement(By.xpath("//input[@title='First Name']")).sendKeys("Test");

			driver.findElement(By.xpath("//input[@title='Last Name']")).sendKeys("Data4");

			driver.findElement(By.xpath("//input[@name='personal[optGender]'][contains(@id,'1')]")).click();

			driver.findElement(By.xpath("//input[@name='personal[DOB]']")).clear();

			Thread.sleep(3000);

			driver.findElement(By.xpath("//input[@name='personal[DOB]']")).sendKeys("2000-07-30");

			driver.findElement(By.xpath("//input[@value='Save']")).click();
			
			driver.close();

		}

}
