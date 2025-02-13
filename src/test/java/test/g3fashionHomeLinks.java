package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class g3fashionHomeLinks {
	public static Logger log;
	
	WebDriver driver;
	@Test(priority = 1)
	public void links(){
		log = LoggerFactory.getLogger(g3fashionHomeLinks.class);
		driver = new ChromeDriver();
		log.info("url opening");
		driver.get("https://g3fashion.com/");
		log.info("maximizing screen");
		driver.manage().window().maximize();
		
		// saree link
		log.info("clicking on saree link");
		driver.findElement(By.cssSelector("#ia3egj")).click();
		String actualtitle = driver.getTitle();
		String expectedTitle = "Sarees - Buy Indian Saree Online for Women";
		System.out.println(actualtitle);
		
		Assert.assertTrue(actualtitle.contains("Sarees - Buy Indian Saree Online for Women"),"Page title does not contain 'Sarees'");
		log.info("verifying title");
		Assert.assertEquals(actualtitle, expectedTitle);
		log.info("navigate to homepage");
		driver.navigate().back();
		
		// salwar kameez
		log.info("clicking on salwar link");
		driver.findElement(By.cssSelector("#isqrp2")).click();
		//System.out.println(driver.getTitle());
		log.info("verifying title");
		Assert.assertEquals(driver.getTitle(),"Buy Salwar Kameez | Indian Readymade Salwar Suits for Women");
		log.info("navigate to home");
		driver.navigate().back();
		
		//Lehenga choli
		log.info("clicking on Lehenga choli link");
		driver.findElement(By.cssSelector("#ir3kp")).click();
		log.info("verifying title");
		Assert.assertEquals(driver.getTitle(), "Buy Lehenga Choli Online for Wedding, Party, Festival");
		String lc = driver.findElement(By.xpath("(//h1[normalize-space()='Lehenga Cholis'])[1]")).getText();
		log.info("verifying page content");
		Assert.assertEquals(lc, "Lehenga Cholis");
		log.info("navigate to home");
		driver.navigate().back();
		
		// Sherwani
		log.info("clicking on Sherwani");
		driver.findElement(By.cssSelector("#i6kgz")).click();
		log.info("verifying title");
		Assert.assertEquals(driver.getTitle(), "Sherwani: Buy Men Sherwani Online Shopping at G3+Fashion");
		String sher = driver.findElement(By.xpath("(//h1[normalize-space()='Sherwani'])[1]")).getText();
		log.info("verifying page content");
		Assert.assertEquals(sher, "Sherwani");
		log.info("naviagte to home");
		driver.navigate().back();
		
		//waiscoat set
		log.info("clicking on waiscoat set");
		driver.findElement(By.id("i58rp")).click();
		log.info("verifying title");
		Assert.assertEquals(driver.getTitle(), "Men Waistcoat Sets: Buy Kurta Jacket Set for Men Online");
		String ws = driver.findElement(By.xpath("(//h1[normalize-space()='Men Kurta Jacket Set'])[1]")).getText();
		log.info("verifying page content");
		Assert.assertEquals(ws, "Men Kurta Jacket Set");
		log.info("naviagte to home");
		driver.navigate().back();				
	}
	
	//@Test(priority = 2)
	public void demo() {
		driver.findElement(By.id("hgdsuysgyd"));
	}
	
	//@Test(priority = 3, dependsOnMethods = {"demo"})
	public void skipped() {
		Assert.assertTrue(false);
	}
	
	@AfterTest
	public void tearDown() {
		log.info("closing browser");
		driver.quit();
	}
}
