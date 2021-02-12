package com.selmavpro.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary 
{
    @FindBy(xpath="//a[text()=' GEARS ']")
    private WebElement gearsbtn;
    
    @FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
    private WebElement skillrarydemoapp;
    
    @FindBy(name="q")
    private WebElement searchtb;
    
    @FindBy(xpath="//input[@value='go']")
    private WebElement gobtn;
    
    
    public Skillrary(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void gearsButton()
    {
    	gearsbtn.click(); 	
    }
    
    public void skillrarydemoapptab()
    {
    	skillrarydemoapp.click();
    }
    
    public void searchtab(String course)
    {
    	searchtb.sendKeys(course);
    }
    
    public void gobutton()
    {
    	gobtn.click();
    }
}
