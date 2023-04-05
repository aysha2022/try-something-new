package com.bit.test;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.BaseTest;

public class EndtoEndStepDefination {
WebDriver dr;
@Given("^open browsers$")

public void open_browsers(DataTable arg1)  {
	BaseTest b=new BaseTest();
	List<List<String>> browsers=arg1.asLists(String.class);
String browser =browsers.get(0).get(0);
/*if(browser.equals("Chrome")){
	System.out.println("open chorme browser");}
	else if(browser.equals("Fairefox")){
		System.out.println("open FaireFox");}
		else if(browser.equals("Safari")) {
			System.out.println("open Safari");*/
		
List<Map<String,String>> bs=arg1.asMaps(String.class, String.class);
 String br=bs.get(0).get("Browser");
 b.OpenBrowser(browser);
 
}
		
				
	
		
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
 // E,K,V must be a scalar (String, Integer, Date, enum etc)
 

@Given("^go to Url$")
public void go_to_Url()  {
    // Write code here that turns the phrase above into concrete actions
}  

@When("^user hoverover MenMenu$")
public void user_hoverover_MenMenu()  {
    // Write code here that turns the phrase above into concrete actions
  
}
@When("^user click New Arrivals Submenu$")
public void user_click_New_Arrivals_Submenu() {
    // Write code here that turns the phrase above into concrete actions
   
}
@When("^user click Shirt product$")
public void user_click_Shirt_product()  {
    // Write code here that turns the phrase above into concrete actions
   
}
}


