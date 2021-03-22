import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchAndAssert {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void FindSoftAssertions() {

        open("https://github.com/selenide/selenide");

        $(byText("Wiki")).click();
        $(byText("Soft assertions")).shouldBe(visible).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));

    }
}