package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class g3fashionHomeLinks {

	WebDriver driver;
	@Test
	public void links(){		
		driver = new ChromeDriver();
		driver.get("https://g3fashion.com/");
		driver.manage().window().maximize();
		
		// saree link
		driver.findElement(By.cssSelector("#ia3egj")).click();
		String actualtitle = driver.getTitle();
		String expectedTitle = "Sarees - Buy Indian Saree Online for Women";
		System.out.println(actualtitle);
		
		Assert.assertTrue(actualtitle.contains("Sarees - Buy Indian Saree Online for Women"),"Page title does not contain 'Sarees'");
		
		Assert.assertEquals(actualtitle, expectedTitle);
		
		driver.navigate().back();
		
		// salwar kameez
		driver.findElement(By.cssSelector("#isqrp2")).click();
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Buy Salwar Kameez | Indian Readymade Salwar Suits for Women");
		driver.navigate().back();
		
		//Lehenga choli
		driver.findElement(By.cssSelector("#ir3kp")).click();
		Assert.assertEquals(driver.getTitle(), "Buy Lehenga Choli Online for Wedding, Party, Festival");
		String lc = driver.findElement(By.xpath("(//h1[normalize-space()='Lehenga Cholis'])[1]")).getText();
		Assert.assertEquals(lc, "Lehenga Cholis");
		driver.navigate().back();
		
		// Sherwani
		driver.findElement(By.cssSelector("#i6kgz")).click();
		Assert.assertEquals(driver.getTitle(), "Sherwani: Buy Men Sherwani Online Shopping at G3+Fashion");
		String sher = driver.findElement(By.xpath("(//h1[normalize-space()='Sherwani'])[1]")).getText();		
		Assert.assertEquals(sher, "Sherwani");
		driver.navigate().back();
		
		//waiscoat set
		driver.findElement(By.id("i58rp")).click();
		Assert.assertEquals(driver.getTitle(), "Men Waistcoat Sets: Buy Kurta Jacket Set for Men Online");
		String ws = driver.findElement(By.xpath("(//h1[normalize-space()='Men Kurta Jacket Set'])[1]")).getText();
		Assert.assertEquals(ws, "Men Kurta Jacket Set");
		driver.navigate().back();				
	}
	
	@Test
	public void demo() {
		driver.findElement(By.id("hgdsuysgyd"));
	}
	
	@Test(dependsOnMethods = {"demo"})
	public void skipped() {
		Assert.assertTrue(false);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
