
  package page;
  
  import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
  import org.openqa.selenium.support.FindBy; import
  org.openqa.selenium.support.How;
  
  public class LoginPage {
  
  WebDriver driver;
  
  public LoginPage(WebDriver driver) {
  
  this.driver = driver; }
  
  // Element library
  
  @FindBy(how = How.ID, using = "username") WebElement USERNAME_ELEMENT;
  
  @FindBy(how = How.NAME, using = "password") WebElement PASSWORD_ELEMENT;
  
  @FindBy(how = How.NAME, using = "login") WebElement SIGNIN_BUTTON_ELEMENT;
  
  // Method to interact with
  
  public void EnterUserName(String userame) {
  USERNAME_ELEMENT.sendKeys(userame); }
  
  public void EnterPassword(String Password) {
  PASSWORD_ELEMENT.sendKeys(Password); }
  
  public void Sigin() { 
	  SIGNIN_BUTTON_ELEMENT.click();
	  } 
  }
  
 