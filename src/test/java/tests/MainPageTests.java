package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Epic("Главная страница")
@Owner("anakotko")
@Tag("yadro_test")
@DisplayName("Главная страница")
public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

        @Test
        @Severity(SeverityLevel.CRITICAL)
        @DisplayName("Проверка отображения логотипа компании")
        void logoShouldBeVisibleTest() {
            mainPage.checkLogoIsVisible();
        }
    }
