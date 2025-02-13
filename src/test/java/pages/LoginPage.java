package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(xpath="(//span[@class='desktop-only'][normalize-space()='Sign in'])[1]")
	private WebElement loginBtn;
	
	@FindBy(xpath="(//input[@id='customer_email'])[2]")
	private WebElement useremail;
	
	@FindBy(xpath="(//input[@id='customer_password'])[2]")
	private WebElement password;
	
	@FindBy(xpath="(//input[@value='Sign In'])[2]")
	private WebElement signBtn;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnLoginBtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));  // Wait until login button is clickable
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
