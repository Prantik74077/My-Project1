package com.selmavpro.Testscripts;

import org.testng.annotations.Test;  

import com.selmavpro.genericlib.BaseClass;
import com.selmavpro.pompages.Addtocart;
import com.selmavpro.pompages.Login;

public class Addingtocart extends BaseClass
{
   @Test
   public void Testcase1()
   {
	   Login l=new Login(driver);
	   u.mouseAction(driver, l.getCoursetab());
	   l.seleniumtrainingbtn();
	   
	   Addtocart a=new Addtocart(driver);
	   u.doubleClick(driver,a.getAddbtn());
	   a.addtocartbutton();
	   
	   u.alertpopup(driver);
	   a.productcart();
	   a.gotocartbtn();
   }
}
