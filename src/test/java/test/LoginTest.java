package test;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void testLogin(ITestContext context) {
		
		context.setAttribute("driver", driver);
		LoginPage loginpg = new LoginPage(driver);
		driver.get(baseURL);
		loginpg.clickOnLoginBtn();
		loginpg.enterEmail(username);
		loginpg.enterPassword(password);
		loginpg.clickOnSignInBtn();
	}
}
