package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ServicePage;

@Epic("Страница 'Сервис'")
@Tag("yadro_test")
@Owner("anakotko")
@DisplayName("Страница 'Сервис'")
public class ServicePageTests extends TestBase{

    ServicePage servicePage = new ServicePage();
    MainPage mainPage = new MainPage();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Открываем страницу Сервис и видим заголовок 'Программы поддержки'")
    void servicePageTest() {
        mainPage.clickServicePage();
        servicePage.servicePageHeaderCheck("Программы поддержки");
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Открываем страницу Сервис и проверяем видимости карты")
    void checkMapShouldBeVisibleTest() {
        mainPage.clickServicePage();
        servicePage.servicePageMapCheck();
}
}
