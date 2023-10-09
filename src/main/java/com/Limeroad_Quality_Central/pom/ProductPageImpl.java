package com.Limeroad_Quality_Central.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Limeroad_Quality_Central.base.BaseClass;

public class ProductPageImpl extends BaseClass{
	
	public ProductPageImpl() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='SHOP MEN']")
	private WebElement shop_men;
	
	@FindBy(id = "men_category")
	private WebElement men_category;
	
	@FindBy(xpath = "(//a[contains(text(),'sports wear')]//following::a[text()='t-shirts'])[1]")
	private WebElement sports_t_shirt;
	
	@FindBy(xpath = "//label[@class='pl36 bs dB p2 pR srt ']//following::div[text()='trending']")
	private WebElement trending_radio_button;
	
	@FindBy(xpath = "//div[@data-a='brandid']")
	private WebElement brand_option;
	
	@FindBy(xpath = "//div[text()='Campus Sutra']")
	private WebElement campus_sutra_brand;
	
	@FindBy(xpath="//div[@id='zero_result']")
	private WebElement white_back_ground;
	
	@FindBy(xpath= "//a[@data-prod-id='16958334']")
	private WebElement first_product;
	
	@FindBy(xpath="//div[@id='zero_result']//following::a[@data-prod-id='16958321']")
	private WebElement seven_seven_nine_rupees_tshirt;
	
	@FindBy(xpath="//span[@id='size_24710959']")
	private WebElement samll_size_choice;
	
	@FindBy(xpath="//div[@onclick='$$.click(this,event)']//following::span[@id='size_24710960']")
	private WebElement medium_size_choice;
	
	@FindBy(xpath="//span[@id='size_24710961']")
	private WebElement large_size_choice;

	public WebElement getShop_men() {
		return shop_men;
	}

	public WebElement getMen_category() {
		return men_category;
	}

	public WebElement getSports_t_shirt() {
		return sports_t_shirt;
	}

	public WebElement getTrending_radio_button() {
		return trending_radio_button;
	}

	public WebElement getBrand_option() {
		return brand_option;
	}

	public WebElement getCampus_sutra_brand() {
		return campus_sutra_brand;
	}

	public WebElement getWhite_back_ground() {
		return white_back_ground;
	}

	public WebElement getFirst_product() {
		return first_product;
	}

	public WebElement getSeven_seven_nine_rupees_tshirt() {
		return seven_seven_nine_rupees_tshirt;
	}

	public WebElement getSamll_size_choice() {
		return samll_size_choice;
	}

	public WebElement getMedium_size_choice() {
		return medium_size_choice;
	}

	public WebElement getLarge_size_choice() {
		return large_size_choice;
	}
	
	
	
}
