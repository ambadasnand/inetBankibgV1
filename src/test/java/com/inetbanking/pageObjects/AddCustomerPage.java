package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how = How.LINK_TEXT, using="New Customer")
	WebElement linkAddNewCustomer;
	
	@FindBy(how = How.NAME, using="name")
	WebElement txtCustomerName;
	
	@FindBy(how = How.NAME, using="rad1")
	WebElement rdGender;
	
	@FindBy(how = How.NAME, using="dob")
	WebElement txtDob;
	
	@FindBy(how = How.NAME, using="addr")
	WebElement txtAddress;
	
	@FindBy(how = How.NAME, using="city")
	WebElement txtCity;
	
	@FindBy(how = How.NAME, using="state")
	WebElement txtState;
	
	@FindBy(how = How.NAME, using="pinno")
	WebElement txtPinno;
	
	@FindBy(how = How.NAME, using="telephoneno")
	WebElement txtTelephoneno;
	
	@FindBy(how = How.NAME, using="emailid")
	WebElement txtEmailid;
	
	@FindBy(how = How.NAME, using="password")
	WebElement txtPassword;
	
	@FindBy(how = How.NAME, using="sub")
	WebElement btnSubmit;
	
	public void clickAddNewCustomer()
	{
		linkAddNewCustomer.click();
	}
	
	
	
	public void custname(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void custgender(String cgender)
	{
		rdGender.click();
	}
	
	public void custdob(String mm, String dd, String yy)
	{
		txtDob.sendKeys(mm);
		txtDob.sendKeys(dd);
		txtDob.sendKeys(yy);
	}
	
	public void custaddress(String caddress)
	{
		txtAddress.sendKeys(caddress);
	}
	
	
	
	public void custcity(String ccity)
	{
		txtCity.sendKeys(ccity);
	}
	
	public void custstate(String cstate)
	{
		txtState.sendKeys(cstate);
	}
	
	public void custpinno(String cpin)
	{
		txtPinno.sendKeys(cpin);
	}
	
	public void custphone(String cphone)
	{
		txtTelephoneno.sendKeys(cphone);
	}
	
	public void custemail(String cemail)
	{
		txtEmailid.sendKeys(cemail);
	}
	
	public void custpassword(String cpass)
	{
		txtPassword.sendKeys(cpass);
	}
	
	public void custsubmit()
	{
		btnSubmit.click();
	}
	

}
