package finalpack;


/*
 * Project 6
 Verify that the “Directory” menu item is visible and clickable
Goal: Verify that the “Directory” menu item is visible and clickable
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import bsh.org.objectweb.asm.Constants;

public class Activity_F6 {
	
	@Test

	public void Directorymenu() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://alchemy.hguy.co/orangehrm");

		LoginPage login = new LoginPage(driver);

		login.typeusername();
		login.typepassword();
		login.ClickOnLoginbutton();

		driver.findElement(By.xpath("//b[contains(.,'Directory')]")).click();

		String actualTxt = driver.findElement(By.xpath("//a[contains(@class,'toggle tiptip')]")).getText();
		String expectedTxt = "Search Directory";
		if (actualTxt.equals(expectedTxt)) {
			System.out.println("Title name present");

			driver.close();

		}

	}

}	


