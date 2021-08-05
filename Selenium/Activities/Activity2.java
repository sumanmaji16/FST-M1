package seleniumProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity2 {

    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void exampleTestCase() {
                    
        //Find the Header
    	String Header = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
        System.out.println("The header text is: " + Header);
                         
        Assert.assertEquals(Header, "Welcome to Alchemy Jobs");
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
