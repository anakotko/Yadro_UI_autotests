package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VacanciesPage {

    private SelenideElement searchInput=$(".first-screen__search"),
    searchResults=$(".vac__result-container");

    @Step("Проверка работы поиска на странице Вакансии")
    public VacanciesPage partnersPageSearch(String searchQuery){
        searchInput.setValue(searchQuery).pressEnter();

        return this;
    }

    @Step("Проверка,что результаты поиска отображаются")
    public VacanciesPage partnersPageSearchResults(){
        searchResults.shouldBe(visible);

        return this;
    }

}
