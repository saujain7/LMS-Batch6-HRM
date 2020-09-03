package finalpack;


/*
 * Project 14
 Creating multiple vacancies
Goal: Creating multiple vacancies using data from an external excel spreadsheet
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity_F14 {




    @Test(dataProvider = "orangeData")
    public void Multipleemployees(String firstName, String lastName, String user_name) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://alchemy.hguy.co/orangehrm");
        LoginPage login = new LoginPage(driver);
        login.typeusername();
        login.typepassword();
        login.ClickOnLoginbutton();
        driver.findElement(By.xpath("//b[contains(.,'PIM')]")).click();
        driver.findElement(By.xpath("//input[@value='Add']")).click();
        driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("firstName");
        driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("lastName");
        driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).click();
        driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("user_name");
        driver.findElement(By.xpath("//input[@value='Save']")).click();
        
        //  Upload a Excel
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[contains(.,'Data Import')]")).click();
        
        driver.findElement(By.xpath("//input[contains(@type,'file')]")).sendKeys("C:\\Users\\SaurabhJain\\Desktop\\Excel.xlsx");
        
        driver.findElement(By.xpath("//input[@value='Upload']")).click();
        
    }
    @DataProvider(name = "orangeData")
    public Object[][] passData() {
        ExcelDataConfig config = new ExcelDataConfig(
                "C:\\Users\\SaurabhJain\\eclipse-workspace\\OrangeProject\\src\\main\\java\\com\\excell\\OrangeProject.xlsx");
        int rows = config.getRowCount(0);
        Object[][] data = new Object[rows][3];
        for (int i = 1; i < rows; i++) {
            data[i][0] = config.getdata(0, i, 0);
            data[i][1] = config.getdata(0, i, 1);
            data[i][2] = config.getdata(0, i, 2);
        }
        return passData();
    }
}
