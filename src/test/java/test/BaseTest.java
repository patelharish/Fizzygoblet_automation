package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utils.ReadConfig;

public class BaseTest {

	ReadConfig readconfig = new ReadConfig();

	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public String invusername = readconfig.getInvUsername();
	public String invpassword = readconfig.getInvPassword();
	public static WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public void setUp(@Optional("chrome") String br) {
		if (br.equals("chrome")) {
			driver = new ChromeDriver();
			// log.info("Running test into chrome browser...");
		} else if (br.equals("firefox")) {
			driver = new FirefoxDriver();
			// log.info("Running test into firefox browser...");
		} else if (br.equals("edge")) {
			driver = new EdgeDriver();
			// log.info("Running test into edge browser...");
		} else {
			System.out.println("Please enter valid browser name");
		}
		driver.get(baseURL);
		//driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		//driver.close();
		driver.quit();
	}
}
