package finalpack;

/*
 * Project 10
 Creating a job vacancy
Goal: To create a job vacancy for “DevOps Engineer”
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Activity_F10 {

	@Test

	public void jobvacancy() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://alchemy.hguy.co/orangehrm");

		LoginPage login = new LoginPage(driver);

		login.typeusername();
		login.typepassword();
		login.ClickOnLoginbutton();
		
		driver.findElement(By.xpath("//b[contains(.,'Recruitment')]")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'Vacancies')]")).click();
		
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		
		Select JobTitle= new Select(driver.findElement(By.xpath("//select[@name='addJobVacancy[jobTitle]'][contains(@id,'jobTitle')]")));
		JobTitle.selectByIndex(3);
		
		driver.findElement(By.xpath("//input[@name='addJobVacancy[name]']")).sendKeys("Dev171");
		
		driver.findElement(By.xpath("//input[@type='text'][contains(@id,'hiringManager')]")).sendKeys("okok Name");
		
		driver.findElement(By.xpath("//input[@name='btnSave']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(.,'Vacancies')]")).click();
		
		Thread.sleep(3000);
		
		Select Vacancy=new Select(driver.findElement(By.xpath("//select[@name='vacancySearch[jobVacancy]']")));
		Vacancy.selectByVisibleText("Dev171");
		
		driver.findElement(By.xpath("//input[contains(@value,'Search')]")).click();
		
		driver.close();
		
	}
}
