package com.selmavpro.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.selmavpro.genericlib.BaseClass;
import com.selmavpro.pompages.Facebook;
import com.selmavpro.pompages.Login;
import com.selmavpro.pompages.Skillrary;
import com.selmavpro.pompages.Testing;

public class LIkeFb extends BaseClass
{
    @Test
    public void Testcase2() throws EncryptedDocumentException, InvalidFormatException, IOException
    {
    	Skillrary s=new Skillrary(driver);
    	s.gearsButton();
    	s.skillrarydemoapptab();
    	
    	u.switchingtab(driver);
    	
    	Login l=new Login(driver);
    	u.dropdown(l.getCoursedd(),p.getPropertyData("data"));
    	
    	Testing t=new Testing(driver);
    	t.facebookbtn();
    	
    	Facebook f=new Facebook(driver);
    	f.likebtn();    	
    }
}
