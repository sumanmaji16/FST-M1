package seleniumProject;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;

	public class Activity9 {
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
	        
	        driver.findElement(By.xpath("(//div[@class='wp-menu-name'])[6]")).click(); //Job listings
	        
	        driver.findElement(By.xpath("(//li/a[@href='post-new.php?post_type=job_listing'])[1]")).click(); //Add new
	        
	        driver.findElement(By.xpath("(//div/button[@type='button'])[21]")).click(); //Close the window pop-up
	        
	        driver.findElement(By.xpath("//div/label[@class='screen-reader-text']")).sendKeys("Data Analyst"); 
	        
	        driver.findElement(By.xpath("(//button[@type='button'])[9]")).click(); //publish
	        
	        driver.findElement(By.xpath("(//button[@type='button'])[8]")).click(); //publish again
	      
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        //driver.quit();
	    }

	}