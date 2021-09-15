package qaguru;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;

public class TestGitHubWiki {
    @Test
    void searchGitHubWiki() {

        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
        $(".markdown-body").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})"));
    }

}

