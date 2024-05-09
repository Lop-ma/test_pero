package com.example.demo.Pages;

import com.example.demo.Base.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;


public class ServicesPage extends BasePage {

    private static final By TITLE = By.xpath(".//*[@class='ui_crumb' and text()='Услуги']");
    private static final By MARKET_LIST = By.xpath(".//*[@id='market_list']");
    private static final By FILTERS = By.xpath(".//*[@id='market_search_filters_btn']");
    private static final By SEARCH_SERVICES = By.xpath(".//*[@id='market_search_input']");

    private static final String TITLE_ON_SERVICES_PAGE = "Title should be enabled on window Services page";
    private static final String MARKET_LIST_ON_SERVICES_PAGE = "Market list should be enabled on Services page";
    private static final String FILTERS_ON_SERVICES_PAGE = "Filters button should be enabled on Services page";
    private static final String SEARCH_SERVICES_CHECK_NAME_INPUT = "Search services input should be enabled for get name this input";

    public ServicesPage() {
        this.checkPage();
    }

    @Override
    public ServicesPage checkPage() {
        $(TITLE).shouldBe(enabled.because(TITLE_ON_SERVICES_PAGE));
        $(MARKET_LIST).shouldBe(enabled.because(MARKET_LIST_ON_SERVICES_PAGE));
        $(FILTERS).shouldBe(enabled.because(FILTERS_ON_SERVICES_PAGE));
        return this;
    }

    public String getNameInput() {
        return $(SEARCH_SERVICES)
                .shouldBe(enabled.because(SEARCH_SERVICES_CHECK_NAME_INPUT))
                .getAttribute("placeholder");

    }
}
