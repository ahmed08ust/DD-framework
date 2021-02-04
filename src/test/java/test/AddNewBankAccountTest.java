
package test;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import page.AddNewBankAccountPage;
import page.ExcelReader;
import page.LoginPage;
import util.BrowserFactory;

public class AddNewBankAccountTest {
	WebDriver driver;
	Random rnd = new Random();

	ExcelReader Reader = new ExcelReader("data\\New Microsoft Excel Worksheet.xlsx");

	String username = Reader.getCellData("LoginInfo", "username", 2);
	String Password = Reader.getCellData("LoginInfo", "password", 2);

	String AccountTitle = Reader.getCellData("AddBankAccount", "AccountTitle", 2);
	String description = Reader.getCellData("AddBankAccount", "Description", 2);
	String initial_balance = Reader.getCellData("AddBankAccount", "initialBalance", 2);
	String account_number = Reader.getCellData("AddBankAccount", "accountNumber", 2);
	String contact_person = Reader.getCellData("AddBankAccount", "contactPerson", 2);
	String phoneNumber = Reader.getCellData("AddBankAccount", "phone", 2);

	@Test
	public void loginTest() throws InterruptedException {

		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.EnterUserName(username);
		login.EnterPassword(Password);
		login.Sigin();

		AddNewBankAccountPage addBankAccount = PageFactory.initElements(driver, AddNewBankAccountPage.class);

		Thread.sleep(3000);

		addBankAccount.BANK_CASH_ELEMENT();
		Thread.sleep(2000);
		addBankAccount.ADD_NEW_ACCOUNT_ELEMENT();
		Thread.sleep(2000);
		
		int RandomNum = rnd.nextInt(99);
		
		addBankAccount.ENTER_ACCOUNT_TITLE_ELEMENT(AccountTitle+RandomNum);
		Thread.sleep(2000);
		addBankAccount.ENTER_DESCRIPTION_ELEMENT(description);
		addBankAccount.ENTER_INITIAL_BALANCE_ELEMENT(initial_balance);
		addBankAccount.ENTER_ACCOUNT_NUMBER_ELEMENT(account_number);
		addBankAccount.ENTER_CONTACT_PERSON_ELEMENT(contact_person);
		addBankAccount.ENTER_PHONE_NUMER_ELEMENT(phoneNumber);
		addBankAccount.click_Submitt();

	}
	@AfterMethod
	public void TearDown() throws InterruptedException{
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
