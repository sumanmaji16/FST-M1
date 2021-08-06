package seleniumProject;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;

	public class Activity6 {
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
	        
	        driver.findElement(By.xpath("//div/input[@id='search_keywords']")).sendKeys("Banking"); //Putting keyword
	        
	        driver.findElement(By.xpath("//div/input[@type='submit']")).click(); //Submit search
	        		
	        driver.findElement(By.xpath("//body[@itemscope='itemscope']")).click(); //Click on a 'job'
	        
	        driver.findElement(By.xpath("//div/input[@type='button']")).click();  //Apply for a job
	        
	        String email = driver.findElement(By.xpath("//a[@href='*sug@domain.com*']")).getText(); //get Text of confirmation message
	        
	        Assert.assertEquals(email, "To apply for this job email your details to sug@domain.com"); //Verifying the confirmation message
	  
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }

	}