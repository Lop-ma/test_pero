package com.example.demo.Pages;

import com.example.demo.Base.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

// page_url = https://vk.com/club225299895?w=product-225299895_10044406
public class ProductPage extends BasePage {

    private static final By PRODUCT_NAME = By.xpath(".//*[@class='ItemName']");
    private static final By ABOUT_SALESMAN = By.xpath(".//*[@class='MarketItemCardShopInfo']");
    private static final By PRICE = By.xpath(".//*[contains(@class, 'ItemPrice-module')]");
    private static final By MARKET = By.xpath(".//*[@class='vkuiButton__in']");

    public ProductPage() {
        this.checkPage();
    }

    @Override
    public ProductPage checkPage() {
        $(PRODUCT_NAME).shouldBe(enabled);
        $(ABOUT_SALESMAN).shouldBe(enabled);
        $(PRICE).shouldBe(enabled);
        return this;
    }

    public ServicesPage openMarket() {
        $(MARKET).shouldBe(enabled).click();
        return new ServicesPage();
    }
}
