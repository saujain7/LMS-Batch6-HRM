package finalpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import junit.framework.Assert;


//Project 2
//Get the url of the header image
//Goal: Print the url of the header image to the console

public class Activity_F2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		
		
		//Open the browser
		driver.get("http://alchemy.hguy.co/orangehrm");
		
		//check the tittle page
		 String title = driver.getTitle();
		 
		//Print the title of the page
	     System.out.println("Page title is: " + title);
	     
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	     
	     Assert.assertEquals("OrangeHRM", title);	 
	    
	    System.out.println("Matched text is found");
	    
	    driver.get("http://alchemy.hguy.co/orangehrm");
		String currentpageurl = driver.getCurrentUrl();
		System.out.println("Current page URL is : " +currentpageurl);
	    
	  			
		//Close the browser
		driver.close();
	}

}

