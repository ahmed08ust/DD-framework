
package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewBankAccountPage {
	WebDriver driver;

	public AddNewBankAccountPage(WebDriver driver) {
		this.driver = driver;

	}

	// Library Elements

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement BANK_CASH_ELEMENT;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement ADD_NEW_ACCOUNT_ELEMENT;

	@FindBy(how = How.ID, using = "account")
	WebElement ENTER_ACCOUNT_TITLE_ELEMENT;

	@FindBy(how = How.ID, using = "description")
	WebElement ENTER_DESCRIPTION_ELEMENT;

	@FindBy(how = How.ID, using = "balance")
	WebElement ENTER_INITIAL_BALANCE_ELEMENT;

	@FindBy(how = How.ID, using = "account_number")
	WebElement ENTER_ACCOUNT_NUMBER_ELEMENT;
	
	@FindBy(how = How.ID, using = "contact_person")
	WebElement ENTER_CONTACT_PERSON_ELEMENT;
	
	@FindBy(how = How.ID, using = "contact_phone")
	WebElement ENTER_PHONE_NUMER_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//button[@type=\"submit\" and @class='btn btn-primary']")
	WebElement click_Submitt_ELEMENT;
	
	// Methods to interact with Element

	public void BANK_CASH_ELEMENT() {
		BANK_CASH_ELEMENT.click();
	}

	public void ADD_NEW_ACCOUNT_ELEMENT() {
		ADD_NEW_ACCOUNT_ELEMENT.click();

	}

	public void ENTER_ACCOUNT_TITLE_ELEMENT(String account_title) {
		ENTER_ACCOUNT_TITLE_ELEMENT.sendKeys(account_title);

	}

	public void ENTER_DESCRIPTION_ELEMENT(String description) {
		ENTER_DESCRIPTION_ELEMENT.sendKeys(description);

	}

	public void ENTER_INITIAL_BALANCE_ELEMENT(String balance) {
		ENTER_INITIAL_BALANCE_ELEMENT.sendKeys(balance);

	}

	public void ENTER_ACCOUNT_NUMBER_ELEMENT(String account_number) {
		ENTER_ACCOUNT_NUMBER_ELEMENT.sendKeys(account_number);
	}
	public void ENTER_CONTACT_PERSON_ELEMENT(String contact_person) {
		ENTER_CONTACT_PERSON_ELEMENT.sendKeys(contact_person);
	}
	public void ENTER_PHONE_NUMER_ELEMENT(String contact_phone) {
		ENTER_PHONE_NUMER_ELEMENT.sendKeys(contact_phone);
	}
	public void click_Submitt() {
		click_Submitt_ELEMENT.click();
	}
	
}
