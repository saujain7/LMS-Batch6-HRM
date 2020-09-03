package finalpack;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;


//Project 1
//Verify the website title
//Goal: Read the title of the website and verify the text



public class Activity_F1 {

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
	    
	    
	    
	  /*  if(String text.contains("OrangeHRM"))
	        {
	        	System.out.println("Matched text is found");
	        	driver.close();
	        }
	        else
	        {
	        	System.out.println("Matched text is not found");
	        }*/
			
		//Close the browser
		driver.close();
	}

}
