package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	@FindBy(xpath="(//span[@class='desktop-only'][normalize-space()='Sign in'])[1]")
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
		useremail.sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickOnSignInBtn() {
		signBtn.click();
	}
	
}
