package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AboutUsPage;
import pages.MainPage;

public class AboutUsPageTests {

    MainPage mainPage = new MainPage();
    AboutUsPage aboutUsPage = new AboutUsPage();

    @Test
    @Tag("yadro_test")
    @DisplayName("Проверка отображения адреса на странице 'О нас' в разделе 'Как с нами связаться'")
    void logoShouldBeVisibleTest() {
        mainPage.openPage()
                .clickAboutUsPage();
        aboutUsPage.howToContactUsBtn()
                .checkAddressOnPage();
    }
}
