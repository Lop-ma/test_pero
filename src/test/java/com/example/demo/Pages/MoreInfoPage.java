package com.example.demo.Pages;

import com.example.demo.Base.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

public class MoreInfoPage extends BasePage {
    private static final By TITLE_WINDOW = By.xpath(".//*[@class = 'group-info-box__title']");
    private static final By CONTACTS = By.xpath(".//*[contains(@class, 'header_label') and text() = 'Контакты']");
    private static final By HISTORY = By.xpath(".//*[contains(@class, 'header_label') and text() = 'История сообщества']");
    private static final By TEXT_CREATE = By.xpath(".//*[contains(@class, 'NameHistoryShortCell') and text() = ' создано']");
    private static final By DATE_CREATE = By.xpath(".//../div[contains(text(), 'год')]");

    private static final String TITLE_WINDOW_ON_MORE_INFO = "Window title should be enabled on window More info";
    private static final String CONTACTS_ON_MORE_INFO = "Contacts should be enabled on window More info";
    private static final String HISTORY_ON_MORE_INFO = "History should be enabled on window More info";
    private static final String TEXT_CREATE_GROUP_GET_CREATE_DATE = "Text 'group create' should be enabled for get create date";
    private static final String DATE_CREATE_GROUP_GET_CREATE_DATE = "Date create should be enabled for get create date";

    public MoreInfoPage() {
        this.checkPage();
    }

    @Override
    public MoreInfoPage checkPage() {
        $(TITLE_WINDOW).shouldBe(enabled.because(TITLE_WINDOW_ON_MORE_INFO));
        $(CONTACTS).shouldBe(enabled.because(CONTACTS_ON_MORE_INFO));
        $(HISTORY).shouldBe(enabled.because(HISTORY_ON_MORE_INFO));
        return this;
    }

    public String getTitleWindow() {
        return $(TITLE_WINDOW)
                .shouldBe(enabled.because(TITLE_WINDOW_ON_MORE_INFO))
                .getText();
    }

    public String getCreateDate() {
        return $(TEXT_CREATE)
                .shouldBe(enabled.because(TEXT_CREATE_GROUP_GET_CREATE_DATE))
                .$(DATE_CREATE)
                .shouldBe(enabled.because(DATE_CREATE_GROUP_GET_CREATE_DATE))
                .getText();
    }
}
