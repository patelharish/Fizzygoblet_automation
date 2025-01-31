package test;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void testLogin() throws InterruptedException {
		
		LoginPage loginpg = new LoginPage(driver);
		loginpg.clickOnLoginBtn();
		loginpg.enterEmail(username);
		loginpg.enterPassword(password);
		loginpg.clickOnSignInBtn();
	}
}
