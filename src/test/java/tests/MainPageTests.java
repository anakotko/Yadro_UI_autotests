package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Epic("Главная страница")
public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

        @Test
        @Owner("anakotko")
        @Severity(SeverityLevel.CRITICAL)
        @Tag("yadro_test")
        @DisplayName("Проверка отображения логотипа компании")
        void logoShouldBeVisibleTest() {
            mainPage
//                    .openPage()
                    .checkLogoIsVisible();
        }
    }
