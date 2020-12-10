package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KnockPage {
	 WebDriver driver ;
	 
	 public KnockPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 //Find Page Elements
	 
	 	By doorwayIframe=By.xpath("//iframe[@class='doorway-notification-frame']");
		
		By scheduleTourButton=By.xpath("//button[contains(text(),'Schedule a Tour')]");
		
		By dwPluginIframe=By.xpath("//iframe[@class='doorway-plugin-frame']");
		
		By dateTextBox=By.cssSelector("#date");
		
		By dateTableBody=By.cssSelector(".CalendarMonthGrid_month__horizontal:nth-child(2) .CalendarMonth_table");
				
		By timeTextBox=By.xpath("//select[@tabindex='3']");
		
		By fnameTextBox=By.xpath("//*[@id=\"InlineCss_PluginScheduling\"]/div/div[2]/div/div[3]/div[1]/div[2]/div[1]/div[1]/input");
		
		By lnameTextBox=By.xpath("//input[@placeholder='Last name']");
		
		By emailTextBox=By.xpath("//input[@type='email']");
		
		By phoneTextBox=By.xpath("//input[@placeholder='Phone']");
		
		By messageTextArea=By.xpath("//*/textarea[1]");
		
		By bedroomsTextBox=By.xpath("//select[contains(option,'Select Bedrooms')]");
		
		By unitTextBox=By.xpath("//select[contains(option,'Select Unit')]");
		
		By bookTourButton=By.xpath("//button[contains(text(),'Book tour!')]");
		
		By cancelapptButton=By.xpath("//button[contains(text(),'Cancel Appointment')]");
		
		By yesCancelButton=By.xpath("//button[contains(text(),'Yes, Cancel')]");
		
		By apptTime=By.xpath("//*[@id=\"InlineCss_PluginScheduling\"]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/select/option[2]");
		
		By bedrooms=By.xpath("//*[text()='2 bedroom']");
		
		By unit=By.xpath("//*[@id=\"InlineCss_PluginScheduling\"]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/select/option[2]");

		//Return Page Elements
		public WebElement NotificationIframe()
		{
			return driver.findElement(doorwayIframe);
		}
		public WebElement PluginIframe()
		{
			return driver.findElement(dwPluginIframe);
		}

		public WebElement ScheduletourBtn()
		{
			return driver.findElement(scheduleTourButton);
		}

		public WebElement Date()
		{
			return driver.findElement(dateTextBox);
		}
		
		public WebElement DateTable()
		{
			return driver.findElement(dateTableBody);
		}

		public WebElement Time()
		{
			return driver.findElement(timeTextBox);
		}

		public WebElement Fname()
		{
			return driver.findElement(fnameTextBox);
		}

		public WebElement Lname()
		{
			return driver.findElement(lnameTextBox);
		}

		public WebElement Email()
		{
			return driver.findElement(emailTextBox);
		}

		public WebElement Phone()
		{
			return driver.findElement(phoneTextBox);
		}

		public WebElement Message()
		{
			return driver.findElement(messageTextArea);
		}

		public WebElement Bedrooms()
		{
			return driver.findElement(bedroomsTextBox);
		}

		public WebElement Unit()
		{
			return driver.findElement( unitTextBox);
		}

		public WebElement BooktourBtn()
		{
			return driver.findElement(bookTourButton);
		}
		public WebElement CancelApptBtn()
		{
			return driver.findElement(cancelapptButton);
		}
		public WebElement YesCancelBtn()
		{
			return driver.findElement(yesCancelButton);
		}
		
		
		public WebElement ApptmtTime()
		{
			return driver.findElement(apptTime);
		}
		
		public WebElement NumBedrooms()
		{
			return driver.findElement(bedrooms);
		}
		
		public WebElement SelectUnit()
		{
			return driver.findElement(unit);
		}
}
