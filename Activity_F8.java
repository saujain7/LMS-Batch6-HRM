package finalpack;

/*
 * Project 8
 Applying for a leave
Goal: Login and apply for a leave on the HRM site
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Activity_F8 {
	
	@Test

	public void Leave() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://alchemy.hguy.co/orangehrm");

		LoginPage login = new LoginPage(driver);

		login.typeusername();
		login.typepassword();
		login.ClickOnLoginbutton();

		driver.findElement(By.xpath("//span[@class='quickLinkText'][contains(.,'Apply Leave')]")).click();

		Select LeaveType = new Select(driver.findElement(By.xpath("//select[@name='applyleave[txtLeaveType]']")));
		LeaveType.selectByIndex(1);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='applyleave[txtFromDate]']")).clear();
		driver.findElement(By.xpath("//input[@name='applyleave[txtFromDate]']")).sendKeys("2020-09-02");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='applyleave[txtToDate]']")).clear();
		driver.findElement(By.xpath("//input[@name='applyleave[txtToDate]']")).sendKeys("2020-09-03");

		driver.findElement(By.xpath("//input[@name='applyleave[txtToDate]']")).click();

		driver.findElement(By.xpath("(//a[contains(.,'My Leave')])[1]")).click();

		driver.close();

	
}

}



	
