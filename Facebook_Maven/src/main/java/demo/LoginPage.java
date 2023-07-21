package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//POM-->page object model
	//Step 1 --> Variable Declaration
	//All data member should be declare globally with the access specifier private
	//POM classes stricaly follows abstraction and encapsulation
	@FindBy (xpath="//input[@id='email']") 
	private WebElement userName;
	@FindBy (xpath="//input[@id='pass']")
	private WebElement passward;
	@FindBy (xpath="//button[text()='Log in']")
	private WebElement login;
	@FindBy (xpath="//a[text()='Create new account']")
	private WebElement createNewAcc;
	
	//Step 2--> Variable Initialization
	//We initialize all data member By using constructor of the class with access specifier public
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Step 2-->Variable Utilization--> Utilize all data members within the method with access specifier public
	public void sendUserName()
	{
		userName.sendKeys("9511744095");
	}
	public void sendPassward()
	{
		passward.sendKeys("krishna12345");
	}
	public void clicklogin()
	{
		login.click();
	}
	public void clickCreateNewAcc()
	{
		createNewAcc.click();
	}
}
