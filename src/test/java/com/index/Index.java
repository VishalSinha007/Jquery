package com.index;

import org.testng.annotations.Test;

import com.init.Common;
import com.init.SeleniumInit;

public class Index extends SeleniumInit{
	
	@Test
	public void Draggable() {
		
		int step =1;
		
		Common.logcase("To Verify the Draggle element is Click in the Home Page</br></br>");
		
		Common.logstep("Step :"+step+++" .Open Url</br></br>");
		
		boolean tf = generalVerification.homepageverification();
		
		if(tf)
			Common.log("===>Home page is opened</br></br>");
		else
			Common.log("Home page is NOT opened</br></br>");
		
	
		Common.logstep("Step :"+step+++" .Click on Draggable Link</br></br>");
		
		generalVerification = generalIndexpage.clickondraggablelink();
		
		
		Common.logstep("Step :"+step+++" .Click on Drag me around</br></br>");
		
		generalVerification = generalIndexpage.draggable();
		
		Common.logcase("To Verify the Draggle element is Click in the Home Page</br></br>");
		
		
		Common.logstep("Step :"+step+++" .Click on Droppable</br></br>");
		
		generalVerification = generalIndexpage.droppable();
		
		
		Common.logstep("Step :"+step+++" .Click on Drag_me_to_my_target</br></br>");
		
		generalVerification = generalIndexpage.drag_me_to_my_target();
		
		Common.logstep("Step :"+step+++" .Click on drop_here</br></br>");
		
		
		boolean drop=generalVerification.drop_here();
		
		if(drop)
			Common.log("==>Dragged the element and Dropped Message should Display</br></br>");
		else
			Common.log("Not Dragging the element and no Message should Display</br></br>");
		
		
		Common.logstep("Step :"+step+++" .Click on Resize option </br></br>");
		
		generalVerification = generalIndexpage.resizable();
		
		Common.logstep("Step :"+step+++" .Resize the option </br></br>");
		
		generalVerification = generalIndexpage.resizable_icon();
		
		
		
		Common.logstep("Step :"+step+++" .Click on Selectable </br></br>");
		
		generalVerification = generalIndexpage.selectable();
		
		
		Common.logstep("Step :"+step+++" .Click on item_select</br></br>");
		
		generalVerification=generalIndexpage.item_select();
		
		
		
		generalVerification = generalIndexpage.serizable();
		
		Common.logstep("Step :"+step+++" .Click on Seriazable </br></br>");
		
		
		
		generalVerification = generalIndexpage.NumberOfItem_selected();
		
		Common.logstep("Step :"+step+++" .Check that NumberOfItem_selected increases or decreases </br></br>");
		
	
		generalVerification = generalIndexpage.sortable();
		
		Common.logstep("Step :"+step+++" .Click on Sortable </br></br>");
		
		
		generalVerification = generalIndexpage.item_sortable();
		
		Common.logstep("Step :"+step+++" .Click on Item Sortable </br></br>");
		
		
		generalVerification = generalIndexpage.accordion();
		
		Common.logstep("Step :"+step+++" .Click on Accordion option </br></br>");
		
		
		generalVerification = generalIndexpage.fill_space();
		
		Common.logstep("Step :"+step+++" .Click on Fill Space option inside Accordion option </br></br>");
		
		
		generalVerification = generalIndexpage.section_2();
	
		Common.logstep("Step :"+step+++" .Click on Section_2 option inside Fill Space option inside Accordion option </br></br>");
		
	/*	
		generalVerification = generalIndexpage.autocomplete();
		
		Common.logstep("Step :"+step+++" .Click on Autocomplete </br></br>");
		
		
		generalVerification = generalIndexpage.tags();
		
		Common.logstep("Step :"+step+++" .Click on Tags </br></br>");
		
		generalVerification = generalIndexpage.button();
		
		Common.logstep("Step :"+step+++" .Click on Button </br></br>");
		
		
		generalVerification = generalIndexpage.AButton_Element();
		
		Common.logstep("Step :"+step+++" .Click on AButton_Element under Widget Buttons </br></br>");
		
		
		generalVerification = generalIndexpage.AnAnchor();
		
		Common.logstep("Step :"+step+++" .Click on AnAnchor Button under Css Button </br></br>");
		
		
		generalVerification = generalIndexpage.checkboxradio();
		
		Common.logstep("Step :"+step+++" .Click on checkboxradio Button </br></br>");
		
		generalVerification = generalIndexpage.Select_a_Location();
		
		Common.logstep("Step :"+step+++" .Click on Select_a_Location Radio Button under Select a Location </br></br>");
		
		
		generalVerification = generalIndexpage.Hotel_Rating();
		
		Common.logstep("Step :"+step+++" .Click on Hotel_Rating Check Box under Hotel Rating </br></br>");
		
		
		generalVerification = generalIndexpage.Bed_Types();
		
		Common.logstep("Step :"+step+++" .Click on Bed_Types Check Box under Bed Types </br></br>");
		
		
		generalVerification =generalIndexpage.control_group();
		
		Common.logstep("Step :"+step+++" .Click on control_group Option </br></br>");
		
		
		generalVerification =generalIndexpage.cartype_button();
		
		Common.logstep("Step :"+step+++" .Click on cartype_button Option </br></br>");
		
		
		generalVerification =generalIndexpage.standard();
		
		Common.logstep("Step :"+step+++" .Click on Standard Check Box Option </br></br>");
		
		
		generalVerification =generalIndexpage.automatic();
		
		Common.logstep("Step :"+step+++" .Click on Automatic Check Box Option </br></br>");
		
		generalVerification =generalIndexpage.insurance();
		
		Common.logstep("Step :"+step+++" .Click on Insurance Check Box Option </br></br>");
		
		generalVerification =generalIndexpage.numberof_cars();
		
		Common.logstep("Step :"+step+++" .Click on # of Cars Option </br></br>");
		
		generalVerification =generalIndexpage.book_now();
		
		Common.logstep("Step :"+step+++" .Click on # of Book Now option under Rental Cars Option </br></br>");
		
		generalVerification =generalIndexpage.split_button();
		
		Common.logstep("Step :"+step+++" .Click on Split Button option under Control Group</br></br>");	
		
		
		generalVerification =generalIndexpage.split_button_dropdown();
		
		Common.logstep("Step :"+step+++" .Click on Split Button DropDown option under Control Group</br></br>");
		
		
		boolean display=generalVerification.Split_Button_Output();
		
		if(display)
		{
			Common.log("==>Output is Displayed");
		}
		else
			Common.log("==>Output not Displayed");
		
		
		generalVerification =generalIndexpage.datepicker();
		
		Common.logstep("Step :"+step+++" .Click on Date Picker Button </br></br>");
		
		
		generalVerification =generalIndexpage.date();
		
		Common.logstep("Step :"+step+++" .Click on Date  Button </br></br>");
		
		
		generalVerification =generalIndexpage.display_month_and_year();
		
		Common.logstep("Step :"+step+++" .Click on display month and year Button </br></br>");
			
		
		generalVerification =generalIndexpage.Month();
		
		Common.logstep("Step :"+step+++" .Click on Month Drop Down </br></br>");
		
		
		generalVerification =generalIndexpage.from_to_date();
		
		Common.logstep("Step :"+step+++" .Click on From to Date option </br></br>");
		
		
		generalVerification =generalIndexpage.From_To();
		
		Common.logstep("Step :"+step+++" .Click on From To Date Boxes </br></br>");
		
		generalVerification =generalIndexpage.dialog();
		
		Common.logstep("Step :"+step+++" .Click on Dialog Box </br></br>");
		
		generalVerification =generalIndexpage.Basic_dialog_close();
		
		Common.logstep("Step :"+step+++" .Click on Close mark in Basic Dialog Box </br></br>");
		
		generalVerification =generalIndexpage.modal_information();
		
		Common.logstep("Step :"+step+++" .Click on Modal Information option </br></br>");
		
		
		generalVerification =generalIndexpage.create_new_user();
		
		Common.logstep("Step :"+step+++" .Create a New User Account  </br></br>");
		
		generalVerification =generalIndexpage.menu();
		
		Common.logstep("Step :"+step+++" .Create a Menu option  </br></br>");
		
		
		generalVerification =generalIndexpage.Music();
		
		Common.logstep("Step :"+step+++" .Create a Music </br></br>");
		
		generalVerification =generalIndexpage.Slider();
		
		Common.logstep("Step :"+step+++" .Click on Slider Menu </br></br>");
		
		generalVerification =generalIndexpage.sliders();
		
		Common.logstep("Step :"+step+++" .Click on Sliders  </br></br>");
		
		
		generalVerification =generalIndexpage.spinner();
		
		Common.logstep("Step :"+step+++" .Click on Spinner  </br></br>");
		
		generalVerification =generalIndexpage.get_value();
		
		Common.logstep("Step :"+step+++" .Handle the Pop Up  </br></br>");
		
		
		generalVerification =generalIndexpage.color_animation();
		
		Common.logstep("Step :"+step+++" .Click on Color Animation option </br></br>");
		
		generalVerification =generalIndexpage.demo_site();
		
		Common.logstep("Step :"+step+++" .Click on Demo Site under Tools QA Home Page </br></br>");
		
		generalVerification =generalIndexpage.automation_pratice_table();
		
		Common.logstep("Step :"+step+++" .Click on automation pratice table under Demo Site </br></br>");
		
		generalVerification =generalIndexpage.structure();
		
		Common.logstep("Step :"+step+++" .Click on structure pratice table under Sample Table </br></br>");
		
		generalVerification =generalIndexpage.saudi_Arabia();
		
		Common.logstep("Step :"+step+++" .Click on saudi_Arabia and find the number of item inside it </br></br>");
		
		
		generalVerification =generalIndexpage.Height();
		
		Common.logstep("Step :"+step+++" .Click on Height and find the number of item inside it </br></br>");
		
		generalVerification =generalIndexpage.built();
		
		Common.logstep("Step :"+step+++" .Show the building built after 2009 </br></br>");
		*/
		
		
		/*Common.logcase("To Verify User is Login and Redirected to His Gmail Home Page</br></br>");
		
		Common.logstep("Step :"+step+++" .Open Gmail</br></br>");
		
		generalVerification =generalIndexpage.LoginGmailAccount("vishalvis.1990@gmail.com", "kvpmr990");
		
		boolean tf = generalVerification.Gmail_Page_Verification();
		
		if(tf)
			Common.log("===>Gmail is Opened and user is Redirected to his/her Home Page.</br></br>");
		else
			Common.log("===>Gmail is Not Opened and user asked for valid username or password.</br></br>");	
		
		
		generalVerification =generalIndexpage.Compose_button();
		
		Common.logstep("Step :"+step+++" .Click on Compose Button </br></br>");
		
		
		generalVerification =generalIndexpage.To_Receipt();
		
		Common.logstep("Step :"+step+++" .Type the email id you want to send Address </br></br>");
		
		
		generalVerification =generalIndexpage.subject();
		
		Common.logstep("Step :"+step+++" .Type the Subject of the mail </br></br>");
		
		
		generalVerification =generalIndexpage.message_body();
		
		Common.logstep("Step :"+step+++" .Type the mail you want to type inside the body </br></br>");
		
		generalVerification =generalIndexpage.send_button();
		
		Common.logstep("Step :"+step+++" .After Typing the mail click on the Send Button</br></br>");
		
		
		boolean message = generalVerification.Message_send_View();
		
		if(message)
			Common.log("===> Message send successfully message should appear at the top of screen.</br></br>");
		else
			Common.log("===> Message send successfully message should not appear at the top of screen.</br></br>");	
		
		
		generalVerification =generalIndexpage.sendmail();
		
		Common.logstep("Step :"+step+++" .After Typing the mail click on the Send Button</br></br>");
		
		
		
		boolean message_verified = generalVerification.Email_Message_Verify();
		
		if(message_verified)
			Common.log("===>Send Message Verified.</br></br>");
		else
			Common.log("===> Send Message Verified.</br></br>");	
		
		System.out.println("=============================");
		
		driver.navigate().to("https://www.mailinator.com/");
		
		System.err.println("New URL Opened: https://www.mailinator.com/");
		
		Common.logcase("New URL Opened: https://www.mailinator.com/");
		
		
		generalVerification =generalIndexpage.check_any_inbox();
		
		Common.logstep("Step :"+step+++" .Go the the Mailinator site and type email id of yours .</br></br>");
		
		
		generalVerification =generalIndexpage.Go_Button();
		
		Common.logstep("Step :"+step+++" .Go the the Mailinator site and type email id of yours and click on Go Button .</br></br>");
		
		
		generalVerification =generalIndexpage.get_mail();
		
		Common.logstep("Step :"+step+++" .Go the the Mailinator email and check for your mail in inbox .</br></br>");
		
		
		boolean message_verified2 = generalVerification.Verify_email_inside_mailinator();
		
		if(message_verified2)
			Common.log("===>Send Message Verified.</br></br>");
		else
			Common.log("===> Send Message Verified.</br></br>");	
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
	}	
}
