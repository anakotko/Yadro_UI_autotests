package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

        @Test
        @Tag("yadro_test")
        @DisplayName("Проверка отображения логотипа компании")
        void logoShouldBeVisibleTest() {
            mainPage.openPage()
                    .checkLogoIsVisible();
        }
    }
