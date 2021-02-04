package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import page.DashboradPage;
import page.ExcelReader;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	ExcelReader Reader = new ExcelReader("data/New Microsoft Excel Worksheet.xlsx");

	String username = Reader.getCellData("LoginInfo", "username", 2);
	String Password = Reader.getCellData("LoginInfo", "password", 2);

	@Test 
	public void loginTest() {

		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.EnterUserName(username);
		login.EnterPassword(Password);
		login.Sigin();

	}

	//@Test
	public void DahboardValidationTest() {

		DashboradPage dashboard = PageFactory.initElements(driver, DashboradPage.class);
		//dashboard.DashboardValidation();
	}

	 @AfterTest
	public void close() {

		BrowserFactory.tearDown();
	}
}
