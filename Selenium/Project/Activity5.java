package seleniumProject;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;

	public class Activity5 {
	    WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        driver.get("https://alchemy.hguy.co/jobs/");
	    }

	    @Test
	    public void exampleTestCase() throws InterruptedException {
	    	
	    	driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click(); //Click on "jobs" link

	        String title = driver.getTitle();  // Check the title of the page
	            
	        System.out.println("Page title is: " + title);  //Print the title of the page
	            
	        Assert.assertEquals(title , "Jobs – Alchemy Jobs"); //Verifying the title
	    	  
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }

	}