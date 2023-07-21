package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import demo.LoginPage;

public class Test_LoginFuctionality {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.sendUserName();
		loginPage.sendPassward();
		loginPage.clicklogin();
		System.out.println(driver.getTitle());
		System.out.println();
	}

}
