package com.selmavpro.Testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.selmavpro.genericlib.BaseClass;
import com.selmavpro.pompages.CoreJavaSeleniumTraining;
import com.selmavpro.pompages.Selenium;
import com.selmavpro.pompages.Skillrary;

public class Payamt extends BaseClass
{
	@Test
	public void Testcase3() throws FileNotFoundException, IOException, InterruptedException
	{
    Skillrary s=new Skillrary(driver);
    s.searchtab(p.getPropertyData("search"));
    s.gobutton();
    
    Selenium s1=new Selenium(driver);
    s1.coursetab();
    
    CoreJavaSeleniumTraining c=new CoreJavaSeleniumTraining(driver);
    
    u.frame(driver);
    c.playbutton();
    Thread.sleep(5000);
    c.pausebutton();
    u.switchbackfromframe(driver);
    Thread.sleep(2000);
    c.takecourse();
   
	}
}
