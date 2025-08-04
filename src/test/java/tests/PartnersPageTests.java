package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.PartnersButtonPage;
import pages.PartnersPage;

@Epic("Страница 'Партнеры'")
@DisplayName("Страница 'Партнеры'")
public class PartnersPageTests extends TestBase{

    MainPage mainPage = new MainPage();
    PartnersPage partnersPage = new PartnersPage();
    PartnersButtonPage partnersButtonPage = new PartnersButtonPage();

    @Test
    @Tag("yadro_test")
    @Owner("anakotko")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Открываем страницу Партнеры и видим заголовок 'Партнерская экосистема'")
    void partnersPageTest() {
        mainPage.clickPartnersPage();
        partnersPage.partnersPageHeaderCheck("Партнерская экосистема");
    }

    @Test
    @Tag("yadro_test")
    @Owner("anakotko")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверяем наличие кнопки 'Стать партнером'")
    void buttonShouldBeVisibleTest() {
        mainPage.clickPartnersPage();
        partnersButtonPage.buttonShouldBeVisible("Стать партнером");
    }
}
