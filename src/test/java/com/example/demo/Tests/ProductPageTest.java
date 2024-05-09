package com.example.demo.Tests;

import com.example.demo.Pages.MainPage;
import com.example.demo.Pages.ProductPage;
import org.junit.jupiter.api.*;

public class ProductPageTest {
    MainPage mainPage;
    ProductPage productPage;

    @BeforeEach
    public void createMainPage() {
        mainPage = new MainPage();
        productPage = mainPage.openProductPage();
    }

    @Test
    @DisplayName("Проверка открытия маркета из карточки товара")
    @Tag("product")
    public void testOpenAllServices() {
        String expectedResult = "Поиск услуг";
        String actualResult = mainPage.openAllServices().getNameInput();
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
