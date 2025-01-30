package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	@FindBy(xpath="a[aria-label='Sign in'] span[class='desktop-only']")
	private WebElement loginBtn;
	
	@FindBy(xpath="(//input[@id='customer_email'])[2]")
	private WebElement useremail;
	
	@FindBy(xpath="(//input[@id='customer_password'])[2]")
	private WebElement password;
	
	@FindBy(xpath="(//input[@value='Sign In'])[2]")
	private WebElement signBtn;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
	public void enterEmail(String uname) {
		loginBtn.sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		loginBtn.sendKeys(pwd);
	}
	
	public void clickOnSignInBtn() {
		loginBtn.click();
	}
	
}
