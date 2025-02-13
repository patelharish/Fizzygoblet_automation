package test;


import org.testng.annotations.Test;


import pages.LoginPage;

public class LoginTest extends BaseTest {

	LoginPage loginpg = new LoginPage(driver);
	
	@Test
	public void testLoginWithValid() throws InterruptedException {				
		loginpg.clickOnLoginBtn();
		loginpg.enterEmail(username);
		loginpg.enterPassword(password);
		loginpg.clickOnSignInBtn();
	}
	
	//@Test
	public void testLoginWithInvalid() {
		loginpg.clickOnLoginBtn();
		loginpg.enterEmail(invusername);
		loginpg.enterPassword(invpassword);
		loginpg.clickOnSignInBtn();
	}
}
