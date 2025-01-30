package test;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void testLogin(ITestContext context) throws InterruptedException {
		
		context.setAttribute("driver", driver);
		LoginPage loginpg = new LoginPage(driver);
		loginpg.clickOnLoginBtn();
		Thread.sleep(3000);
		loginpg.enterEmail(username);
		loginpg.enterPassword(password);
		loginpg.clickOnSignInBtn();
	}
}
