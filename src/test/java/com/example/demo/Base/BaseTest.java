package com.example.demo.Base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    private static final String BASE_URL = "https://vk.com/club225299895";
    private static final String BROWSER = "chrome";
    private static final String URL = "/";
    @BeforeAll
    public static void setUp() {
        Configuration.baseUrl = BASE_URL;
        Configuration.browser = BROWSER;
        Configuration.browserSize = "1280x800";
    }

    @BeforeEach
    public void open() {
        Selenide.open(URL);
    }

    @AfterEach
    public void close() {
        Selenide.closeWebDriver();
    }
}
