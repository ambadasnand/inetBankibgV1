package com.inetbanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException
	{
		
		
		logger.info("URL is Opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("entered username");
		
		lp.setPassword(password);
		logger.info("entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		
		else
		{
			captureScreenshot(driver,"logintest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}

}
