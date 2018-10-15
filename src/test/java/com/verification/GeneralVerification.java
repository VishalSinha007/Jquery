package com.verification;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.indexpage.GeneralIndexpage;
import com.init.AbstractPage;
import com.init.Common;

public class GeneralVerification extends AbstractPage {

	public GeneralVerification(WebDriver driver) {
		super(driver);
	}

	public boolean homepageverification() {

		Common.pause(10);
		WebElement logo = driver.findElement(By.xpath(".//div[@id='logo-events']//a[contains(text(),'jQuery UI')]"));

		if (logo.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean drop_here() {

		Common.pause(5);

		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));

		WebElement element1 = driver.findElement(By.xpath(".//div[@id='droppable']//p[text()='Dropped!']"));

		if (element1.isDisplayed()) {

			driver.switchTo().defaultContent();

			return true;
		} else {
			driver.switchTo().defaultContent();

			return false;
		}		
	}
	
	public boolean item_select1() {
		
		Common.pause(4);
		
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
		
		WebElement ele=driver.findElement(By.xpath(".//ol[@id='selectable']//li"));
		
		if(ele.isDisplayed()) 
		{	
			driver.switchTo().defaultContent();

			return true;
		}
	 else 
	 {
		driver.switchTo().defaultContent();

		return false;
	}		
		
	}
		public boolean NumberOfItem_selected1() {
			
			Common.pause(4);
			
			WebElement ele=driver.findElement(By.xpath(".//span[@id='select-result']"));
			
			if(ele.isDisplayed()) 
			{	
				Common.log(ele.getText());

				return true;
			}
		 else 
		 {
			
			return false;
		}		
		
	}
	
		public boolean Split_Button_Output() {
			
			Common.pause(4);
			
			 List<WebElement> output = driver.findElements(By.xpath(".//ul[@class='output']//li"));
			
			if(!output.isEmpty())
				
			{
				
				for(WebElement ele:output)
					
					Common.log(ele.getText());
				
				return true;
			}
			
			else
				
			{
				
				return false;
			}	
			
		}
		
	public boolean Gmail_Page_Verification() {
			
			Common.pause(5);
			
			WebElement compose_button = driver.findElement(By.xpath(".//div[text()='COMPOSE']"));
			
			String result = null;
			if(!(compose_button==null)) {
				
				result=compose_button.getText();
				System.err.println("Gmail Home Page Verifiction by Locating Element inside it :"+result);
				
				Common.logcase("Gmail Home Page Verifiction by Locating Element inside it :"+result);
				
			return true;
			}
			else {
				return false;
			}
		}
	
	
	public boolean Message_send_View() {
		
		WebElement msg_display = driver.findElement(By.xpath(".//span[text()='View message']/.."));
		
			if(msg_display.isDisplayed()) {
				
				String result = msg_display.getText();
				
				System.err.println("Gmail should Display Send Message :"+result);
				
				Common.logcase("Gmail should Display Send Message:"+result);
				
			return true;
			}
			else {
				return false;
			}
		
	}
		
		public boolean Email_Message_Verify() {
			
			Common.pause(3);
			
			String name_in_sent_item=GeneralIndexpage.name1;
			
			Common.pause(5);
				
			WebElement element2 = driver.findElement(By.xpath(".//div[2][text()='To: ']//span[contains(.,"+name_in_sent_item+")]"));	
			
			System.out.println(element2.getText());
		
			
			if(element2.getText().trim().equals(name_in_sent_item)) 
			{
				System.err.println("Send Message Verified");
				
				Common.logcase("Send Message Verified");
				
				return true;
					
			}else {
			
				System.err.println("Send Message Not Verified");
			return false;
		}
		}
		
		public boolean Verify_email_inside_mailinator() {
			
			driver.switchTo().frame(driver.findElement(By.id("msg_body")));
			
			WebElement element = driver.findElement(By.xpath(".//div[contains(.,'No Bug fouund So Far')]"));
			
			if(element.isDisplayed()) 
			{
				Common.log("Element is Visible :"+element.getText());
				
				System.err.println("Element is Visible :"+element.getText());
				
				return true;
			}
			else {
				System.err.println("Element Not Visible");
				
				driver.switchTo().defaultContent();
				
				return false;
			}
		}
		
		
		
		
		
		
		
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*
	 * public boolean verifyDashboardPage() {
	 * 
	 * WebElement dashboardButton =
	 * driver.findElement(By.xpath(".//div//li/a[text()='My Holdings']")); return
	 * dashboardButton.isDisplayed();
	 * 
	 * }
	 */
}
