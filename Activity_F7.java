package finalpack;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/*
 * Project 7
 Adding qualifications
Goal: Add employee qualifications
 */

public class Activity_F7 {
	
	@Test
	public void userinformation() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://alchemy.hguy.co/orangehrm");

		LoginPage login = new LoginPage (driver);

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

               // Adding qualifications\\


		driver.findElement(By.xpath("(//a[contains(.,'Qualifications')])[2]")).click();

		driver.findElement(By.xpath("(//input[@class='hover']")).click();

		driver.findElement(By.xpath("//input[@type='text'][contains(@id,'employer')]")).sendKeys("IBM New");

		driver.findElement(By.xpath("//input[@name='experience[jobtitle]']")).sendKeys("JobIBM");

		driver.findElement(By.xpath("//input[@name='experience[jobtitle]']")).click();
		
		driver.findElement(By.xpath("http://alchemy.hguy.co/orangehrm")).click();

		driver.close();

	}
}


