package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AboutUsPage;
import pages.MainPage;

@Epic("Страница 'О нас'")
public class AboutUsPageTests extends TestBase{

    MainPage mainPage = new MainPage();
    AboutUsPage aboutUsPage = new AboutUsPage();

    @Test
    @Owner("anakotko")
    @Severity(SeverityLevel.CRITICAL)
    @Tag("yadro_test")
    @DisplayName("Проверка отображения адреса на странице 'О нас' в разделе 'Как с нами связаться'")
    void logoShouldBeVisibleTest() {
        mainPage
//                .openPage()
                .clickAboutUsPage();
        aboutUsPage.howToContactUsBtn()
                .checkAddressOnPage();
    }
}
