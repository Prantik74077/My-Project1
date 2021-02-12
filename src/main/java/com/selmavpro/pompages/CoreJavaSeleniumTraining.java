package com.selmavpro.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaSeleniumTraining
{
     @FindBy(xpath="//div[@class='play-icon']")
     private WebElement playbtn;
     
     @FindBy(xpath="//div[@class='pause-icon']")
     private WebElement pausebtn;
     
     @FindBy(xpath="//div[@class='controls enroll_take_course']")
     private WebElement takethiscourse;
     
     public CoreJavaSeleniumTraining(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
     
     public void playbutton()
     {
    	 playbtn.click();
     }
     
     public void pausebutton()
     {
    	 pausebtn.click();
     }
     
     public void takecourse()
     {
    	 takethiscourse.click();
     }
}
