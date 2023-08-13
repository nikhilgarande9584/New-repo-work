package travelassign;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MakeMyTrip {
	WebDriver driver;

	@Test
     public void flightbooking() {
		
	//	WebDriverManager.Chromedriver().setup();
		
    	 driver = new ChromeDriver();
    	 
    	 driver.manage().window().maximize();
    	 
    	 driver.get("https://www.makemytrip.com/");
    	 
    	 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    	 
    	 WebElement departure = driver.findElement(By.xpath("//label[@for=\"departure\"]//span[@class=\"lbl_input appendBottom10\"]"));
    	 
    	 Actions act = new Actions(driver);
    	 
    	 act.click().perform();
    	 
    	 
    	 
    	 for(int i=0; i<=3; i++)
    	 {
    		 WebElement arrow = driver.findElement(By.xpath("//span[@role=\"button\"][@aria-label=\"Next Month\"]"));
    		
    		 arrow.click();
    	 }
    	 
    	 driver.findElement(By.xpath("//div[@aria-label=\"Fri Nov 17 2023\"]//div[@class=\"dateInnerCell\"]")).click();
    	 
       	 driver.findElement(By.xpath("//a[text()=\"Search\"]"));
    	 
    	 driver.findElement(By.xpath("(//*[@id=\"listingFilterCheckbox\"])[1]"));
    	 
    	 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    	 
    	 act.scrollByAmount(0, 500).perform();
    	 
    	 driver.findElement(By.xpath("(//*[@class=\"appendBottom2 checkBlockIcon\"])[3]")).click();
    	 
    	 act.scrollByAmount(0, 700).perform();
    	 
    	 driver.findElement(By.xpath("//*[@id=\"bookbutton-RKEY:d6fde075-fb8b-472d-8d17-f2dd04ab7f60:271_0\"]"));

    	 act.scrollByAmount(0, 100).perform();
    	 
         driver.findElement(By.xpath("//*[@id=\"bookbutton-RKEY:d6fde075-fb8b-472d-8d17-f2dd04ab7f60:271_3\"]"));
	}  
         @Test
         public void trainbk()
         {
           driver.findElement(By.xpath("//li[@class=\"menu_Trains\"]//*[@href=\"https://www.makemytrip.com/railways/\"] "));
     
           WebElement from = driver.findElement(By.xpath("//label[@for=\"fromCity\"]//*[@type=\"text\"]"));
         
           Select sel = new Select(from);
           
           sel.selectByVisibleText("Mumbai");
           
           driver.findElement(By.xpath("//input[@id=\"travelDate\"]"));
      
           while(true)
   		{
   		
   	    WebElement monthyear = driver.findElement(By.xpath("//*[text()=\\\"Search\\"));
   		
   		System.out.println(monthyear);
   		
   		if(!(monthyear.equals("09 dec sat")))
   		{
   			driver.findElement(By.xpath("//*[@class=\"slick-arrow slick-next\"]")).click();
   		}
   		else
   		{
   			break;
   		}
   		
   		}
           
           driver.findElement(By.xpath("(//*[@id=\"train_options_09-12-2023_1\"])[1]")).click();
           
           driver.findElement(By.xpath("//*[text()=\"OK, GO AHEAD\"]")).click();
           
           driver.findElement(By.xpath("//*[text()=\"Pay & Book Now\"]")).click();
     }
		
	
	
	}
	
	
	
	
	
	


