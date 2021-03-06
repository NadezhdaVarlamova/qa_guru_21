package gmail.com.varlamvanadia1996.tests;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class AndroidSelenideTestsWiki extends TestBase {
    @Test
    void searchTest() {
        step("Кликнуть SKIP", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click();
        });
        step("Поиск", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("BrowserStack");
        });
        step("Проверка поисковой выдачи", () ->
                $$(byClassName("android.widget.TextView")).shouldHave(sizeGreaterThan(0)));
    }
}
