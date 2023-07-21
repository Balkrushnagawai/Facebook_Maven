package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import demo.CreateNewAcc;
import demo.LoginPage;

public class TestClass_CreateNewPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.clickCreateNewAcc();
		Thread.sleep(3000);
		CreateNewAcc createNewAcc =new  CreateNewAcc(driver);
		createNewAcc.sendFirstName();
		createNewAcc.sendLastname();
		createNewAcc.sendMobileNumber();
		createNewAcc.sendRegPass();
		createNewAcc.selectDayDropDown();
		createNewAcc.selectMonthDropDown();
		createNewAcc.selectyearDropDown();
		createNewAcc.clickOnGender();
		createNewAcc.clickOnSignup();
		System.out.println();
	}

}
