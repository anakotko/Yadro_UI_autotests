package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.PartnersButtonPage;
import pages.PartnersPage;

public class PartnersPageTests {

    MainPage mainPage = new MainPage();
    PartnersPage partnersPage = new PartnersPage();
    PartnersButtonPage partnersButtonPage = new PartnersButtonPage();

    @Test
    @Tag("yadro_test")
    @DisplayName("Открываем страницу Партнеры и видим заголовок 'Партнерская экосистема'")
    void partnersPageTest() {
        mainPage.openPage()
                .clickPartnersPage();
        partnersPage.partnersPageHeaderCheck("Партнерская экосистема");
    }

    @Test
    @Tag("yadro_test")
    @DisplayName("Проверяем наличие кнопки 'Стать партнером'")
    void buttonShouldBeVisibleTest() {
        mainPage.openPage()
                .clickPartnersPage();
        partnersButtonPage.buttonShouldBeVisible("Стать партнером");
    }
}
