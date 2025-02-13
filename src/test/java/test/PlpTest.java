package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.PlpPage;

public class PlpTest extends BaseTest {
	
	@Test
	public void plpFilters() {
		PlpPage pg = new PlpPage(driver);
		pg.clickOnShopBtn();
		pg.clickProductType();
		pg.selectBootsOption();
		
	}

}
