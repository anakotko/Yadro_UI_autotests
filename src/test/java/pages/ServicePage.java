package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class ServicePage {
    private SelenideElement headerServicePage=$("h2.color-blue.text-center"),
                            mapServicePage = $(".map_container");

    @Step("Проверка заголовка 'Программы поддержки' на странице Сервис")
    public ServicePage servicePageHeaderCheck(String value){
        headerServicePage.shouldHave(text(value));

        return this;
    }

    @Step("Проверка видимость карты на странице Сервис")
    public ServicePage servicePageMapCheck(){
        mapServicePage.shouldBe(visible);

        return this;
    }
}
