package finalpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;


//Project 3
//Logging into the site
//Goal: Open the site and login with the credentials provided

public class Activity_F3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    WebDriver driver = new FirefoxDriver();
		
		//Open the browser
		driver.get("http://alchemy.hguy.co/orangehrm");
		
	
		
        //Find username and password fields
		
    //    WebElement userName = driver.findElement(By.xpath("//input[starts-with(@class, 'Username')]"));
	
    //    WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'Password')]"));
		
	//	WebElement txtUsername = driver.findElement(By.id("txtUsername"));
	//	WebElement txtPassword = driver.findElement(By.id("txtPassword"));
	
        //Type credentials
	
   //     Username.sendKeys("orange");
	
   //     Password.sendKeys("orangepassword123");
	
        //Click Log in
	
  //     driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
	
        
	
   //     //Print login message
	
  //      String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
	
   //     System.out.println("Login message: " + loginMessage);
		
		WebElement txtUsername = driver.findElement(By.id("txtUsername"));
		WebElement txtPassword = driver.findElement(By.id("txtPassword"));
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        txtUsername.sendKeys("orange");
        txtPassword.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        
      //Print login message
    	
             String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
      	
              System.out.println("Login message: " + loginMessage);
    
       
        String actualUrl="http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login";
        String expectedUrl= driver.getCurrentUrl();
       
        Assert.assertEquals(actualUrl, expectedUrl);
        System.out.println("expectedUrl is :" +expectedUrl);
		
		//Close the browser
				driver.close();

	}

}
