package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ServicePage;

public class ServicePageTests {

    ServicePage servicePage = new ServicePage();
    MainPage mainPage = new MainPage();

    @Test
    @Tag("yadro_test")
    @DisplayName("Открываем страницу Сервис и видим заголовок 'Программы поддержки'")
    void servicePageTest() {
        mainPage.openPage()
                .clickServicePage();
        servicePage.servicePageHeaderCheck("Программы поддержки");
    }
//    проверка видимости карты
    @Test
    @Tag("yadro_test")
    @DisplayName("Открываем страницу Сервис и проверяем видимости карты")
    void checkMapShouldBeVisibleTest() {
        mainPage.openPage()
                .clickServicePage();
        servicePage.servicePageMapCheck();
}
}
