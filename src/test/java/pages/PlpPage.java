package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlpPage {
	
	WebDriver ldriver;
	
	@FindBy(xpath="(//span[@class='overlay-text__button button altcolour'][normalize-space()='Shop Now'])[1]")
	private WebElement shopBtn;
	
	@FindBy(xpath="//div[normalize-space()='Product Type']")
	private WebElement productType;
	
	@FindBy(xpath="(//label[@class=\"filter-group__item\"])[2]")
	private WebElement selectBoots;
	
	public PlpPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void clickOnShopBtn() {
		shopBtn.click();
	}
	
	public void clickProductType() {
		productType.click();
	}
	
	public void selectBootsOption() {
		selectBoots.click();
	}
	

}
