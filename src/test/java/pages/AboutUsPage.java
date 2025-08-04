package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class AboutUsPage {
    private SelenideElement contactUsBtn = $(".tn-atom[href='/ru/contacts']"),
            checkAddress = $("field=tn_text_1588843481511");

    @Step("Переходим в раздел 'Как с нами связаться'")
    public AboutUsPage howToContactUsBtn(){
        contactUsBtn.click();

        return this;
    }

    @Step("Проверяем наличие адреса")
    public AboutUsPage checkAddressOnPage(){
        checkAddress.shouldHave(text("123376, г. Москва, ул. Рочдельская 15, стр. 15"));

        return this;
    }

}
