package com.inetbanking.testCases;

import java.io.IOException;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddNewCustomer_003_Test extends BaseClass {
	
	@Test
	public void AddNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		Thread.sleep(3000);
		addcust.custname("Ambadas");
		addcust.custgender("male");
		addcust.custdob("10", "15","1987");
		Thread.sleep(3000);
		addcust.custaddress("Latur");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		
		addcust.custcity("Latur");
		addcust.custstate("Maharashtra");
		addcust.custpinno("412545");
		addcust.custphone("4456564567");
		
		String email = randomString()+"@gmail.com";
		addcust.custemail(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		Thread.sleep(3000);
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreenshot(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
	}
	
	

}
