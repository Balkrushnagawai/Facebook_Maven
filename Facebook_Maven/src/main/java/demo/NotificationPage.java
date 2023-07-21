package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationPage {
	@FindBy (xpath="(//div[@class='x9f619 x5yr21d x1sxyh0'])[1]")
	private WebElement readButton;
	@FindBy (xpath="(//div[@class='x9f619 x5yr21d x1sxyh0'])[2]")
	private WebElement unReadButton;
	
	@FindBy (xpath="//div[contains(@class,'x1td3qas xjbqb8w')]")
	private WebElement dotButton;

	public NotificationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnReadButton()
	{
		readButton.click();
	}
	public void clickOnUnreadButton() 
	{
		unReadButton.click();
	}
	public void clickOnDotButton()
	{
		dotButton.click();
	}
}
