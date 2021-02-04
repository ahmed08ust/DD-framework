
  package page;
  
  import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
  import org.openqa.selenium.support.FindBy; import
  org.openqa.selenium.support.How; import org.testng.Assert;
  
  public class DashboradPage {
  
  WebDriver driver;
  
  public DashboradPage(WebDriver driver) { this.driver = driver; }
  
  // Element Library
  
  @FindBy(how = How.XPATH, using = "//h2[contains(text(),' Dashboard ')]")
  WebElement DASHBOARD_VALIDATION_ELEMENT;
  
	/*
	 * public void DashboardValidation() {
	 * 
	 * String DashboardText = DASHBOARD_VALIDATION_ELEMENT.getText();
	 * System.out.println(DashboardText);
	 * 
	 * Assert.assertEquals(" Dashboard ", DashboardText, "Wrong Page!!"); }
	 */
  }
 