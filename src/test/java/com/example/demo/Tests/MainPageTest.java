package com.example.demo.Tests;

import com.example.demo.Base.BaseTest;
import com.example.demo.Pages.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MainPageTest extends BaseTest {

    MainPage mainPage;

    @BeforeEach
    public void createMainPage() {
        mainPage = new MainPage();
    }

    @Test
    @DisplayName("Проверка открытия окна с Подробной информацией")
    @Tag("more_info")
    public void testOpenMoreInfo() {
        String expectedResult = "Подробная информация";
        String actualResult = mainPage.openMoreInfo().getTitleWindow();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Проверка даты создания сообщества")
    @Tag("more_info")
    public void testCreateDate() {
        String expectedResult = "28 марта 2024 года";
        String actualResult = mainPage.openMoreInfo().getCreateDate();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Проверка открытия окна со всеми услугами")
    @Tag("services")
    public void testOpenAllServices() {
        String expectedResult = "Поиск услуг";
        String actualResult = mainPage.openAllServices().getNameInput();
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
