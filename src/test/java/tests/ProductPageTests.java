package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ProductPage;

public class ProductPageTests {
    MainPage mainPage = new MainPage();
    ProductPage productPage = new ProductPage();

    @Test
    @Tag("yadro_test")
    @DisplayName("Открываем страницу Продукты, отображается строчка 'Новый импульс для развития бизнеса'")
    void productPageTest() {
        mainPage.openPage()
                .clickProductPage();
        productPage.productPageHeaderCheck("Новый импульс для развития бизнеса");
    }
}
