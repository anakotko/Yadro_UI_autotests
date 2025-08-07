package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainPage;
import pages.VacanciesPage;

@Epic("Страница 'Вакансии'")
@Owner("anakotko")
@Tag("yadro_test")
@DisplayName("Проверка работы поиска на странице 'Вакансии'")
public class VacanciesPageTests extends TestBase{

    MainPage mainPage = new MainPage();
    VacanciesPage vacanciesPage = new VacanciesPage();

    @ParameterizedTest(name = "Для поиского запроса {0} не должна возвращаться пустая страница")
    @ValueSource(strings = {
            "java", "qa", "c"
    })
    @Severity(SeverityLevel.CRITICAL)
    void vacanciesPageTest(String searchQuery) {
        mainPage.clickVacanciesPage();
        vacanciesPage.partnersPageSearch(searchQuery)
                .partnersPageSearchResults();
    }
}
