package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAcc {
	private WebDriver driver;
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement mobNumber;
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement regPassward;
	@FindBy(xpath="//select[@id='day']")
	private WebElement dayDropDown;
	@FindBy(xpath="//select[@id='month']")
	private WebElement monthDropDown;
	@FindBy(xpath="//select[@id='year']")
	private WebElement yearDropDown;
	@FindBy(xpath="(//input[@name='sex'])[1]")
	private WebElement gender;
	@FindBy(xpath="//Button[text()='Sign Up']")
	private WebElement signup;
	
	
	public CreateNewAcc(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	public void sendFirstName()
	{
		firstname.sendKeys("Archana");
	}
	public void sendLastname()
	{
		lastname.sendKeys("Edke");
	}
	public void sendMobileNumber()
	{
		mobNumber.sendKeys("7758027409");
	}
	public void sendRegPass()
	{
		regPassward.sendKeys("Archana123");
	}
	public void selectDayDropDown()
	{
		Select s = new Select(dayDropDown);
		s.selectByIndex(15);
	}
	public void selectMonthDropDown()
	{
		Select s = new Select(monthDropDown);
		s.selectByValue("6");
	}
	public void selectyearDropDown()
	{
		Select s = new Select(yearDropDown);
		s.selectByVisibleText("1997");
	}
	public void clickOnGender()
	{
		gender.click();
	}
	public void clickOnSignup()
	{
		signup.click();
	}
	
}
