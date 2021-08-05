package seleniumProject;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;

	public class Activity8 {
	    WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	    }

	    @Test
	    public void exampleTestCase() throws InterruptedException {
	        
	        /* Following are the lines of code to login to
	         the website to post a job */
	        
	        driver.findElement(By.id("user_login")).sendKeys("root");
	        
	        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	        
	        driver.findElement(By.xpath("//p[@class='submit']/input[@id='wp-submit']")).click();
	        
	        String title = driver.getTitle(); 
	        
	        System.out.println("Page title is: " + title);  //Print the title of the page
	        
	        Assert.assertEquals(title , "Dashboard ‹ Alchemy Jobs — WordPress"); //Verifying the title
	  
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }

	}