package seleniumProject;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;

	public class Activity7 {
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
	       
	    	driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/post-a-job/']")).click(); //Click on "jobs" link

	        System.out.println("Page title is: " + driver.getTitle());  //Print the title of the page
	            
	        driver.findElement(By.xpath("//a[@class='button']")).click(); //'Sign in' button click
	        
	        System.out.println("Page title is: " + driver.getTitle());  //Print the title of the page
	        
	        /* Following are the lines of code to login to
	         the website to post a job */
	        
	        driver.findElement(By.id("user_login")).sendKeys("root");
	        
	        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	        
	        driver.findElement(By.xpath("//p[@class='submit']/input[@id='wp-submit']")).click();
	        
	        System.out.println("Page title is: " + driver.getTitle());  //Print the title of the page
	        //Post a job mandatory fields
	        driver.findElement(By.xpath("//div/input[@id='job_title']")).sendKeys("Test"); //'Job_title' field
	        
	        driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("suman"); //'Description' field of job
	        
	        System.out.println("Page title is: " + driver.getTitle());  //Print the title of the page
	        
	        driver.findElement(By.xpath("//div/input[@id='job_preview_submit_button']")).click(); //Submit
	        //verification
	        driver.findElement(By.xpath("//div[@class='entry-content clear']/a")).click(); //click here to see submitted job
	        
	        String title = driver.getTitle();  // Check the title of the page
	        
	        System.out.println("Page title is: " + driver.getTitle());  //Print the title of the page
	        
	        Assert.assertEquals(title , "Test"); //Verifying the title
	        
	        String description = driver.findElement(By.xpath("//div[@class='job_description']/p")).getText();  // Check job description
	        
	        System.out.println("Job description is: " + description);  //Print job description
	        
	        Assert.assertEquals(description , "suman"); //Verifying the job description
	  
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }

	}