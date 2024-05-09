package com.example.demo.Pages;

import com.example.demo.Base.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage {
    private static final By GROUP_AVATAR = By.xpath(".//*[@class='redesigned-group-avatar']");
    private static final By GROUP_NAME = By.xpath(".//*[@class='page_name']");
    private static final By GROUP_WALL = By.xpath(".//*[@id='group_wall']");
    private static final By MORE_INFO = By.xpath(".//*[contains(@class, 'info-more')]");
    private static final By SHOW_ALL_SERVICES = By.xpath(".//*[@data-role='show-all']");
    private static final By PRODUCT_NAME = By.xpath(".//*[@title='For testing test']");

    private static final String GROUP_AVATAR_ON_MAIN_PAGE = "Group avatar should be enabled and on Main group page";
    private static final String GROUP_NAME_ON_MAIN_PAGE = "Group name should be enabled and on Main group page";
    private static final String GROUP_WALL_ON_MAIN_PAGE = "Group wall should be enabled and on Main group page";
    private static final String MORE_INFO_OPEN_MORE_INFO = "More info button should be enabled for open window with More info";
    private static final String SHOW_ALL_SERVICES_OPEN_SERVICES = "Button Show all should be enabled for open Services page";

    public MainPage() {
        this.checkPage();
    }
    @Override
    public MainPage checkPage() {
        $(GROUP_AVATAR).shouldBe(enabled.because(GROUP_AVATAR_ON_MAIN_PAGE));
        $(GROUP_NAME).shouldBe(enabled.because(GROUP_NAME_ON_MAIN_PAGE));
        $(GROUP_WALL).shouldBe(enabled.because(GROUP_WALL_ON_MAIN_PAGE));
        return this;
    }

    public MoreInfoPage openMoreInfo() {
        $(MORE_INFO).shouldBe(enabled.because(MORE_INFO_OPEN_MORE_INFO)).click();
        return new MoreInfoPage();
    }

    public ServicesPage openAllServices() {
        $(SHOW_ALL_SERVICES).shouldBe(enabled.because(SHOW_ALL_SERVICES_OPEN_SERVICES)).click();
        return new ServicesPage();
    }

    public ProductPage openProductPage() {
        $(SHOW_ALL_SERVICES).shouldBe(enabled.because(SHOW_ALL_SERVICES_OPEN_SERVICES)).click();
        return new ProductPage();
    }
}
