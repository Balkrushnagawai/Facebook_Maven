package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
	@FindBy (xpath="(//span[@class='x1n2onr6'])[1]") 
	private WebElement homeButton;
	@FindBy (xpath="(//span[@class='x1n2onr6'])[2]") 
	private WebElement friendsButton;
	@FindBy (xpath="(//span[@class='x1n2onr6'])[3]") 
	private WebElement groupButton;
	@FindBy (xpath="(//span[@class='x1n2onr6'])[4]") 
	private WebElement gamingButton;
	
	@FindBy (xpath="//div[@aria-label='Create']") 
	private WebElement createButton;
	@FindBy (xpath="(//(//div[@aria-label='Messenger'])[1]") 
	private WebElement messengerButton;
	@FindBy (xpath="//div[@aria-label='Notifications, 2 unread']") 
	private WebElement notificationButton;
	@FindBy (xpath="//body//div[1]//div[1]//div[1]//div[1]//div[2]//div[5]//div[1]//div[1]//div[1]")
	private WebElement imageButton;
	
	public HeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnHomeButton()
	{
		homeButton.click();
	}
	public void clickOnFriendsButton()
	{
		friendsButton.click();
	}
	public void clickOnGroupButton()
	{
		groupButton.click();
	}
	public void clickOnGamingButton()
	{
		gamingButton.click();
	}
	public void clickOnCreateButton()
	{
		createButton.click();
	}
	public void clickOnMessengerButton()
	{
		messengerButton.click();
	}
	public void clickOnNotificationButton()
	{
		notificationButton.click();
}
}
