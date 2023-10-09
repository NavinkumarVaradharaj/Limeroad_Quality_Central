package com.Limeroad_Quality_Central.pom;

public interface ProductPage {
	
	String shop_men = "//span[text()='SHOP MEN']";
	String men_category = "men_category";
	String sports_t_shirt = "(//a[contains(text(),'sports wear')]//following::a[text()='t-shirts'])[1]";
	String trending_radio_button = "//label[@class='pl36 bs dB p2 pR srt ']//following::div[text()='trending']";
	String brand_option = "//div[@data-a='brandid']";
}
