package testcases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectrepository.KnockPage;

public class scheduleatourTest  {
WebDriver driver;

@Test
public void verifyHomepageTitle() throws Exception {
//Launch the Page and validate the title
		System.out.println("launching Chrome browser"); 
    	System.setProperty("webdriver.chrome.driver", "C:\\Projects\\eclipse-workspace\\Crm\\src\\main\\java\\drivers\\chromedriver.exe");
    	ChromeOptions chromeOptions= new ChromeOptions();
   	    chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe");
   	    WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   	    driver.get("https://knockrentals.github.io/doorway-v3/");
   	    driver.manage().window().maximize();
   	  	String expectedTitle = "Stage Example";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(5000);
		
//Click on the Schedule a Tour button
		KnockPage kn=new KnockPage(driver);
		driver.switchTo().frame(kn.NotificationIframe());
		kn.ScheduletourBtn().click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(kn.PluginIframe());
		
//Select Date for appointment 
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kn.Date()));
		DateFormat dateFormat = new SimpleDateFormat("dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, 1);
        String newDate = dateFormat.format(cal.getTime());
        System.out.println(newDate);
		kn.Date().click();
		Thread.sleep(3000);
        WebElement selectDate = driver.findElement(By.xpath("//td[@class='CalendarDay CalendarDay_1 CalendarDay__default CalendarDay__default_2'][contains(text(),'"+newDate+"')]"));
		selectDate.click();
		
// Select Time for appointment
		kn.ApptmtTime().click();
		
// Enter First name, Last name, email and phone number
		kn.Fname().sendKeys("Steve");
		kn.Lname().sendKeys("Gates");
		kn.Email().sendKeys("steve.gates@wa.state");
		kn.Phone().sendKeys("425-001-0000");
		
// Add a message
		kn.Message().sendKeys("I would like to make an appointment for apartment viewing");
		
// Select Bedrooms and Unit
		kn.NumBedrooms().click();
		
// Select Unit
		kn.SelectUnit();

// Click Book tour! button verify success message
		kn.BooktourBtn().click();
		WebElement msg=driver.findElement(By.xpath("//*[contains(text(),'A text and email with details will arrive shortly.')]"));
		String text=msg.getText();
		String expectedText= "A text and email with details will arrive shortly.";
		Assert.assertEquals(text,expectedText);
		System.out.println("Appointment Booked Successfully");
		
//	Cancel Appointment	
		kn.CancelApptBtn().click();
		kn.YesCancelBtn();
		
// Delete all cookies and close
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.close();
   }

}



