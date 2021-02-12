package com.selmavpro.pompages;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
     @FindBy(id="course")
     private WebElement coursetab;
     
     @FindBy(xpath="//a[text()='Selenium Training']")
     private WebElement seleniumtraining;
     
     @FindBy(name="addresstype")
     private WebElement coursedd;
     
     public WebElement getCoursedd() 
     {
		return coursedd;
	 }

	public Login(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
     
     public void seleniumtrainingbtn()
     {
    	 seleniumtraining.click();
     }

	public WebElement getCoursetab() 
	{
		return coursetab;
	}
}
