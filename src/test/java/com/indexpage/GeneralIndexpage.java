package com.indexpage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.init.AbstractPage;
import com.init.Common;
import com.verification.GeneralVerification;


/**
 * @author Vishal
 *
 */
public class GeneralIndexpage  extends AbstractPage{

	public static String name1;
	public static String name;
	
	public GeneralIndexpage(WebDriver driver) {
		super(driver);
	}

	@FindBy (xpath=".//a[contains(text(),'Draggable')]")
		private WebElement draggablelink;
	
	public GeneralVerification clickondraggablelink() {
		
		Common.pause(3);
		
		draggablelink.click();
		
		return new GeneralVerification(driver);
	}
	
	
	@FindBy(xpath=".//div[@id='draggable']//p[contains(text(),'Drag me around')]")
		private WebElement draggable;
	
		public GeneralVerification draggable() {
		
			Common.pause(3);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 // This will scroll down the page by 1000 pixel vertical
		 js.executeScript("window.scrollBy(0,500)");
		
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
		 
			Common.pause(5);
		
		Actions act= new Actions(driver);
		
		//Scroll Vertical
		act.dragAndDropBy(draggable, 0, 200).build().perform();
		
			Common.pause(5);
		
		//Scroll Horizontal
		act.dragAndDropBy(draggable, 200, 0).build().perform();
		
		driver.switchTo().defaultContent();
		
		return new GeneralVerification(driver);
		
	}
	
	@FindBy(xpath=".//a[text()='Droppable']")
	private WebElement droppable;
	
		public GeneralVerification droppable() {
		
			Common.pause(3);
		
		droppable.click();
		
		return new GeneralVerification(driver);
		
	}
	
	@FindBy(xpath=".//div[@id='draggable']//p[text()='Drag me to my target']")
	private WebElement drag_me_to_my_target;
	
	@FindBy(xpath=".//div[@id='droppable']//p[text()='Drop here']")
	private WebElement drop_here;
	
		public GeneralVerification drag_me_to_my_target() {
			
			Common.pause(3);
			
			driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
			
			Common.pause(2);
			Actions act1=new Actions(driver);
			
			act1.dragAndDrop(drag_me_to_my_target, drop_here).build().perform();
			
			driver.switchTo().defaultContent();
	
			return new GeneralVerification(driver);
			
		}
	
		@FindBy(xpath=".//a[text()='Resizable']")
		private WebElement resizable;
		
			public GeneralVerification resizable() {
				
				Common.pause(2);
				
				resizable.click();
				
				return new GeneralVerification(driver);
				
			}
		
			@FindBy(xpath=".//div[@id='resizable']/div[3]")
			private WebElement resizable_icon;
			
				public GeneralVerification resizable_icon() {
					
					Common.pause(2);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					Actions act2=new Actions(driver);
					
					act2.clickAndHold(resizable_icon).moveByOffset(50, 40).click().build().perform();
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
					
				}
			
				@FindBy(xpath=".//a[text()='Selectable']")
				private WebElement selectable;
				
					public GeneralVerification selectable() {
						
						Common.pause(2);
						
						selectable.click();
						
						return new GeneralVerification(driver);
					}
	
				
				public GeneralVerification item_select()
				{
					
					Common.pause(2);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					 List<WebElement> ele = driver.findElements(By.xpath(".//ol[@id='selectable']//li"));
					
					 Common.log(ele.get(1).getText());
					 
					for(WebElement element:ele) {
						Common.pause(4);
						
						element.click();
							
					}
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
					
				}
				
				
				@FindBy(xpath=".//a[text()='Serialize']")
				private WebElement serizable;
				
				public GeneralVerification serizable()
				
				{
					
					Common.pause(1);
					
					serizable.click();
					
					return new GeneralVerification(driver);
					
				}
	
				@FindBy(xpath=".//p[@id='feedback']")
				private WebElement NumberOfItem_selected;
				
				public GeneralVerification NumberOfItem_selected() {
					
					Common.pause(2);
					
				driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
				List<WebElement> ele = driver.findElements(By.xpath(".//ol[@id='selectable']//li"));
				
				for(WebElement element:ele) {
					
					Common.pause(2);
					
					element.click();
				}
				
				driver.switchTo().defaultContent();
				
				return new GeneralVerification(driver);	
				}
	
				@FindBy(xpath=".//a[text()='Sortable']")
				private WebElement sortable;
				
				public GeneralVerification sortable() {
					
					Common.pause(2);
					
					sortable.click();
					
					return new GeneralVerification(driver);
				}
	
				@FindBy(xpath=".//li[text()='Item 1']")
				private WebElement item_sortable;
				
				public GeneralVerification item_sortable() {
					
					Common.pause(2);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
				//	WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 3']"));
					Actions act=new Actions(driver);
					Common.pause(2);
					
					//act.clickAndHold(item_sortable).moveByOffset(0, 100).pause(2000).release(item_sortable).build().perform();
					//act.moveToElement(item_sortable, 0, 300).build().perform();
					//act.dragAndDrop(item_sortable, ele1).build().perform();
					act.dragAndDropBy(item_sortable, 0,100).build().perform();
					
					Common.pause(5);
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
					
				}
	
				@FindBy(xpath=".//a[text()='Accordion']")
				private WebElement accordion;
				
				public GeneralVerification accordion() {
					
					Common.pause(3);
					
					accordion.click();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//a[text()='Fill space']")
				private WebElement fill_space;
				
				public GeneralVerification fill_space() {
					
					Common.pause(5);
					
					fill_space.click();
					
					return new GeneralVerification(driver);
				}
				
				
				@FindBy(xpath=".//h3[text()='Section 2']")
				private WebElement section_2;
				
				public GeneralVerification section_2() {
					
					Common.pause(3);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					Common.pause(15);
					
					Common.pause(1);
					
					section_2.click();
					
					WebElement element = driver.findElement(By.xpath(".//div[@id='ui-id-4']/."));
					
					 JavascriptExecutor js = (JavascriptExecutor) driver;
					 
					 // This will scroll down the page by 1000 pixel vertical
					 js.executeScript("arguments[0].scrollBy(0,1000);", element);

					Common.pause(10);
					
					return new GeneralVerification (driver);
				}}
				
	/*			@FindBy(xpath=".//a[text()='Autocomplete']")
				private WebElement autocomplete;
				
				public GeneralVerification autocomplete() {
					
					Common.pause(10);
					
					autocomplete.click();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//input[@id='tags']")
				private WebElement tags;
				
				public GeneralVerification tags() {
					
					Common.pause(3);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					tags.sendKeys("a");
					
					Common.pause(8);
					
					WebElement element = driver.findElement(By.xpath(".//ul[@id='ui-id-1']//li[9]//div[text()='JavaScript']"));
					
					element.click();
					
					Common.pause(8);
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//a[text()='Button']")
				private WebElement button;
				
				public GeneralVerification button() {
					
					Common.pause(2);
					
					button.click();
					
					return new GeneralVerification(driver);
				}
				
				
				@FindBy(xpath=".//h1[contains(text(),'Widget Buttons')]/./..//button[contains(text(),'A button element')]")
				private WebElement AButton_Element;
				
				public GeneralVerification AButton_Element() {
					
					Common.pause(3);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					AButton_Element.click();
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//h1[text()='CSS Buttons']/../..//a[@class='ui-button ui-widget ui-corner-all']")
				private WebElement AnAnchor;
				
				public GeneralVerification AnAnchor() {
					
					Common.pause(4);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					AnAnchor.click();
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//a[text()='Checkboxradio']")
				private WebElement checkboxradio;
				
				public GeneralVerification checkboxradio() {
					
					Common.pause(2);
					
					checkboxradio.click();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//label[text()='Paris']")
				private WebElement Select_a_Location;
				
				public GeneralVerification Select_a_Location() {
					
					 JavascriptExecutor js = (JavascriptExecutor) driver;
					 // This will scroll down the page by 500 pixel vertical
					 js.executeScript("window.scrollBy(0,500)");
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					Common.pause(4);
					
					JavascriptExecutor js1 = (JavascriptExecutor) driver;
					 
					 // This will scroll down the page by 1000 pixel vertical
					 js1.executeScript("arguments[0].scrollBy(0,1000);", Select_a_Location);
					
					Select_a_Location.click();
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//label[text()='5 Star']")
				private WebElement Hotel_Rating;
				
				public GeneralVerification Hotel_Rating() {
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					Common.pause(2);
					
					Hotel_Rating.click();
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//label[contains(text(),'1 King')]")
				private WebElement Bed_Types;
				
				public GeneralVerification Bed_Types() {
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					Common.pause(2);
					
					Bed_Types.click();
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//a[text()='Controlgroup']")
				private WebElement control_group;
				
				public GeneralVerification control_group() {
					
					Common.pause(2);
					
					control_group.click();
					
					return new GeneralVerification(driver);
				}
				
				
				public GeneralVerification cartype_button() {
					
					Common.pause(4);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					
					WebElement element = driver.findElement(By.xpath(".//span[@id='car-type-button']"));
					
					element.click();
					
					Common.pause(4);
					
					WebElement car_type = driver.findElement(By.xpath(".//ul[@id='car-type-menu']//li//div[text()='SUV']"));
					
					car_type.click();
					
					Common.pause(4);
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//label[@for='transmission-standard' and text()='Standard']")
				private WebElement standard;
				
				public GeneralVerification standard() {
					
					Common.pause(3);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					standard.click();
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//label[@for='transmission-automatic' and text()='Automatic']")
				private WebElement automatic;
				
				public GeneralVerification automatic() {
					
					Common.pause(3);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					automatic.click();
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//label[@for='insurance' and text()='Insurance']")
				private WebElement insurance;
				
				public GeneralVerification insurance() {
					
					Common.pause(3);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					insurance.click();
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//input[@id='horizontal-spinner']")
				private WebElement numberof_cars;
				
				public GeneralVerification numberof_cars() {
					
					Common.pause(3);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					numberof_cars.sendKeys("3");
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//fieldset[1]//button[text()='Book Now!']")
				private WebElement book_now;
				
				public GeneralVerification book_now() {
					
					Common.pause(3);
					
					book_now.click();
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				
				@FindBy(xpath=".//a[text()='Split Button']")
				private WebElement split_button;
				
				public GeneralVerification split_button() {
					
					Common.pause(3);
					
					split_button.click();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//span[@id='ui-id-1-button']")
				private WebElement split_button_dropdown;
				
				public GeneralVerification split_button_dropdown() {
					
					Common.pause(3);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					split_button_dropdown.click();
					
					Common.pause(3);
					
					WebElement Save_option=driver.findElement(By.xpath(".//ul[@id='ui-id-1-menu']//li//div[text()='Save']"));
					
					Save_option.click();
					
					split_button_dropdown.click();
					
					Common.pause(3);
					
					WebElement Open=driver.findElement(By.xpath(".//ul[@id='ui-id-1-menu']//li//div[text()='Open...']"));
					
					Open.click();
					
					split_button_dropdown.click();
					
					Common.pause(3);
					
					WebElement Delete=driver.findElement(By.xpath(".//ul[@id='ui-id-1-menu']//li//div[text()='Delete']"));
					
					Delete.click();
					
					Common.pause(3);
					
					return new GeneralVerification(driver);
					
				}
				
				@FindBy(xpath=".//a[text()='Datepicker']")
				private WebElement datepicker;
				
				public GeneralVerification datepicker() {
					
					Common.pause(3);
					
					datepicker.click();
					
					return new GeneralVerification(driver);
				}
		
				@FindBy(xpath=".//input[@id='datepicker' and @type='text']")
				private WebElement date;
				
				public GeneralVerification date() {
					
					Common.pause(4);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					date.click();
					
					Common.pause(4);
					
					date.sendKeys("11/30/2018");
					
					Common.pause(4);
					
					date.sendKeys(Keys.ENTER);
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//a[text()='Display month & year menus']")
				private WebElement display_month_and_year;
				
				public GeneralVerification display_month_and_year() {
					
					Common.pause(5);
					
					display_month_and_year.click();
					
					return new GeneralVerification(driver);
				}
				
				
				public GeneralVerification Month() {
					
					Common.pause(4);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					driver.findElement(By.xpath(".//input[@id='datepicker']")).click();
					
					Common.pause(4);
					
					Select month=new Select(driver.findElement(By.xpath(".//select[@class='ui-datepicker-month']")));
					
					Common.pause(4);
					
					month.selectByVisibleText("Nov");
					
					Common.pause(4);
					
					Select Year=new Select(driver.findElement(By.xpath(".//select[@class='ui-datepicker-year']")));
					
					Common.pause(6);
					
					Year.selectByValue("2020");
					
					Common.pause(6);
					
					 WebElement Day = driver.findElement(By.xpath(".//a[contains(text(),'30')]"));
					
					Common.pause(4);
					
					Day.click();
					
					Common.pause(4);
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//a[text()='Select a Date Range']")
				private WebElement from_to_date;
				
				public GeneralVerification from_to_date() {
					
					Common.pause(4);
					
					from_to_date.click();
					
					return new GeneralVerification(driver);
				}
				
				
				public GeneralVerification From_To() {
					
					Common.pause(3);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					WebElement from_date = driver.findElement(By.xpath(".//input[@id='from' and @type='text']"));
					
					from_date.click();
					
					Select month=new Select(driver.findElement(By.xpath(".//select[@class='ui-datepicker-month']")));
					
					Common.pause(4);
					
					month.selectByVisibleText("Nov");
					
					Common.pause(6);
					
					 WebElement Day = driver.findElement(By.xpath(".//a[contains(text(),'30')]"));
					
					Common.pause(4);
					
					Day.click();
					
					Common.pause(4);
					
					WebElement to = driver.findElement(By.xpath(".//input[@id='to' and @type='text']"));
					
					to.click();
					
					Common.pause(3);
					
					Select month1=new Select(driver.findElement(By.xpath(".//select[@class='ui-datepicker-month']")));
					
					Common.pause(4);
					
					month1.selectByVisibleText("Dec");
					
					Common.pause(4);
					
					 WebElement Day1 = driver.findElement(By.xpath(".//a[contains(text(),'31')]"));
					
					Common.pause(4);
					
					Day1.click();
					
					Common.pause(4);
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//a[text()='Dialog']")
				private WebElement dialog;
				
				public GeneralVerification dialog() {
					
					Common.pause(2);
					
					dialog.click();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//button[@type='button' and @title='Close']")
				private WebElement Basic_dialog_close;
				
				public GeneralVerification Basic_dialog_close() {
					
					Common.pause(5);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					Basic_dialog_close.click();
					
					Common.pause(5);
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//a[text()='Modal form']")
				private WebElement modal_information;
				
				public GeneralVerification modal_information() {
					
					Common.pause(3);
					
					modal_information.click();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//button[@id='create-user']")
				private WebElement create_new_user;
				
				public GeneralVerification create_new_user() {
					
					Common.pause(3);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					create_new_user.click();
					
					Common.pause(3);
					
					WebElement name = driver.findElement(By.xpath(".//input[@id='name']"));
					
					name.clear();
					
					name.sendKeys("Johnny");
					
					Common.pause(3);
					
					WebElement email_id = driver.findElement(By.xpath(".//input[@id='email' and @type='text']"));
					
					email_id.clear();
					
					email_id.sendKeys("Johnny@example.com");
					
					Common.pause(3);
					
					WebElement password_it = driver.findElement(By.xpath(".//input[@id='password' and @type='password']"));
					
					password_it.clear();
					
					password_it.sendKeys("000000");
					
					Common.pause(3);
					
					WebElement click_create_on_account = driver.findElement(By.xpath(".//button[text()='Create an account']"));
					
					click_create_on_account.click();
					
					Common.pause(5);
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//a[text()='Menu']")
				private WebElement menu;
				
				public GeneralVerification menu() {
					
					Common.pause(3);
					
					menu.click();
					
					return new GeneralVerification(driver);
				}
				
				public GeneralVerification Music() {
					
					Common.pause(4);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					WebElement music = driver.findElement(By.xpath(".//div[text()='Music']"));
					
					music.click();
					
					Common.pause(4);
					
					WebElement rock = driver.findElement(By.xpath(".//div[text()='Rock']"));
					
					rock.click();
					
					Common.pause(4);
					
					WebElement alternative = driver.findElement(By.xpath(".//div[text()='Alternative']"));
					
					alternative.click();
					
					Common.pause(5);
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//a[text()='Slider']")
				private WebElement Slider;
				
				public GeneralVerification Slider() {
					
					Common.pause(4);
					
					Slider.click();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//div[@id='slider']//span")
				private WebElement sliders;
				
				public GeneralVerification sliders() {
					
					Common.pause(4);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					Actions action=new Actions(driver);
					
					action.clickAndHold(sliders).moveByOffset(100, 0).click().build().perform();
					
					Common.pause(5);
					
					action.clickAndHold(sliders).moveByOffset(200, 0).click().build().perform();
					
					Common.pause(5);
					
					action.clickAndHold(sliders).moveByOffset(300, 0).click().build().perform();
					
					Common.pause(5);
					
					action.clickAndHold(sliders).moveByOffset(400, 0).click().build().perform();
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//a[text()='Spinner']")
				private WebElement spinner;
				
				
				public GeneralVerification spinner() {
					
					Common.pause(3);
					
					spinner.click();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//button[text()='Get value']")
				private WebElement get_value;
				
				public GeneralVerification get_value() {
					
					Common.pause(3);
					
					driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='demo-frame']")));
					
					get_value.click();
					
					driver.switchTo().alert().accept();
					
					Common.pause(4);
					
					driver.switchTo().defaultContent();
					
					return new GeneralVerification(driver);
				}
				
				@FindBy(xpath=".//a[text()='Color Animation']")
				private WebElement color_animation;
					
				public GeneralVerification color_animation() {
					
					Common.pause(3);
					
					color_animation.click();
					
					return new GeneralVerification(driver);
					
				}	
				
				
	
		@FindBy(xpath=".//ul[@id='primary-menu']//li//a//span[text()='DEMO SITES']")
		private WebElement demo_site;
		
		public GeneralVerification demo_site() {
			
			Common.pause(3);
			
			demo_site.click();
			
			return new GeneralVerification(driver);
		}
				
				

		@FindBy(xpath=".//ul[@id='primary-menu']//li//a//span[text()='Automation Practice Table']")
		private WebElement automation_pratice_table;
		
		public GeneralVerification automation_pratice_table() {
			
			Common.pause(3);
			
			automation_pratice_table.click();
			
			return new GeneralVerification(driver);
		}	
				
					
		public GeneralVerification structure() {
			
			Common.pause(3);
			
			List<WebElement> element = driver.findElements(By.xpath(".//div[@id='content']//tbody//tr[3]"));	
			int i=element.size();
				
			System.out.println(i);
			
		for(WebElement ele:element) 
		{
			if(!element.isEmpty());
			
			Common.log(ele.getText());
			System.out.println();
		}
		
		
		return new GeneralVerification(driver);
		
	}
		
		public GeneralVerification saudi_Arabia() {
			
			Common.pause(3);
			
			List<WebElement> element = driver.findElements(By.xpath(".//div[@id='content']//tbody//tr[2]//td"));
			
			for(WebElement ele:element) 
			{
				if(!element.isEmpty())
					
					Common.log(ele.getText());
			}
			
			return new GeneralVerification(driver);
		}
		
		
		public GeneralVerification Height() 
		{
			int i=600;
			
			Common.pause(3);
			
			List<WebElement> height_morethen_600 = driver.findElements(By.xpath(".//div[@id='content']//tbody/tr/td[3]"));
			List<Integer> list = new ArrayList<Integer>();
					
					if(!height_morethen_600.isEmpty()) {
						
						for(WebElement ele:height_morethen_600)
						{
							String heigh = ele.getText().replace("m", "").trim();
							
							Common.log(heigh);
							
							int strTointNo =Integer.parseInt(heigh);
							
							int x = strTointNo;
								if(strTointNo>=i) {
									list.add(strTointNo);
								}
							
						}
						
							System.err.println(list);
							
		}
					return new GeneralVerification(driver);
			
		}
		
			
			public GeneralVerification built() {
				
				Common.pause(3);
				
				List<WebElement> biuld_year = driver.findElements(By.xpath(".//div[@id='content']//tbody/tr/td[4]"));
				List<Integer> list = new ArrayList<Integer>();
				

				if(!biuld_year.isEmpty()) {
					
					for(WebElement ele:biuld_year)
					{
						String heigh = ele.getText();
						
						Common.log(heigh);
						
						int strTobuildNo =Integer.parseInt(heigh);
						
						int x = strTobuildNo;
							if(strTobuildNo>=2009) {
								list.add(strTobuildNo);
							}
						
					}
					
						System.err.println(list);
						
	}
				
				return new GeneralVerification(driver);
			}}*/

	/*
		@FindBy(xpath=".//input[@id='identifierId' and @type='email']")
		private WebElement Username;
		
		@FindBy(xpath=".//div[@id='identifierNext']")
		private WebElement Next;
		
		@FindBy(xpath=".//input[@type='password']")
		private WebElement Password;
		
		@FindBy(xpath=".//div[@id='passwordNext']")
		private WebElement Login;
		
		
		public GeneralVerification LoginGmailAccount(String username, String password) {
				
			Common.pause(4);
			
			Username.sendKeys(username);
			Common.pause(4);
			Next.click();
			Common.pause(4);
			Password.sendKeys(password);
			Common.pause(4);
			Login.sendKeys(Keys.ENTER);
			Common.pause(4);
			
			return new GeneralVerification(driver);
		}
	
	
	@FindBy(xpath=".//div[text()='COMPOSE']")
	private WebElement compose;
	
	public GeneralVerification Compose_button() {
		
		Common.pause(3);
		
		compose.click();
		
		return new GeneralVerification(driver);
	}
	
	
	@FindBy(xpath=".//textarea[@class='vO' and @name='to']")
	private WebElement To;
	
	
	
	public GeneralVerification To_Receipt() {
		
		Random random = new Random();
		int number=random.nextInt(1000)+10;
		
               name1="vishal.singha"+Integer.toString(number);
		
	           name=name1+"@mailinator.com";
		
		Common.pause(3);
		
		To.sendKeys(name);
		
		return new GeneralVerification(driver);
	}
	
	
	@FindBy(xpath=".//input[@name='subjectbox']")
	private WebElement subject;
	
	public GeneralVerification subject() {
		 
		Common.pause(3);
		
		subject.sendKeys("bakwaash mail");
		
		return new GeneralVerification(driver);
	}
	
	
	@FindBy(xpath=".//div[@class='Am Al editable LW-avf' and @aria-label='Message Body']")
	private WebElement message_body;
	
	public GeneralVerification message_body() {
		
		Common.pause(3);
		
		message_body.sendKeys("No Bug fouund So Far");
		
		return new GeneralVerification(driver);
	}
	
	
	@FindBy(xpath=".//div[text()='Send']")
	private WebElement send_button;
	
	public GeneralVerification send_button() {
		
		Common.pause(3);
		
		send_button.click();
		
		return new GeneralVerification(driver);
	}
	
	
	@FindBy(xpath=".//span[text()='View message']/..")
	private WebElement send_msg_view;
	
	public GeneralVerification send_msg_view() {
		
		Common.pause(3);
		
		send_msg_view.click();
		
		return new GeneralVerification(driver);
	}
	
	
	@FindBy(xpath=".//a[text()='Sent Mail']")
	private WebElement sendmail;
	
	public GeneralVerification sendmail() {
		
		Common.pause(3);
		
		sendmail.click();
		
		return new GeneralVerification(driver);
	}

	@FindBy(xpath=".//input[@type='text' and @id='inboxfield']")
	private WebElement check_any_inbox;
	
	public GeneralVerification check_any_inbox() {
		
		Common.pause(3);
			
		check_any_inbox.sendKeys(name1);
		
		
		return new GeneralVerification(driver);
	}
	
	@FindBy(xpath=".//button[contains(text(),'Go!')]")
	private WebElement Go_Button;
	
	public GeneralVerification Go_Button() {
		
		Common.pause(4);
		
		Go_Button.click();
		
		return new GeneralVerification(driver);
	}
		
	public GeneralVerification get_mail() {
		
		Common.pause(5);
		
		WebElement element = driver.findElement(By.xpath(".//ul[@id='inboxpane']"));
		
		System.out.println(element.getText());
		
		String ele = element.getText().trim();
		
		WebElement element1 = driver.findElement(By.xpath(".//div[text()='Vishal Sinha']"));
			
			element1.click();
		
		Common.pause(5);
		
		System.err.println(ele);
		
		Common.log(ele);
		
		return new GeneralVerification(driver);
	}
	
}
*/	
	
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				
				
			
				
	
	/*public GeneralVerification loginAs(String emailAddress, String password) {

		txtEmailId.sendKeys(emailAddress);
		Common.pause(1);
		txtPassword.sendKeys(password);

		Common.pause(1);

		btnLogin.click();

		return new GeneralVerification(driver);
	}*/
	
	
	
	
	


