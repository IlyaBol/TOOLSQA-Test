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
    void testGitHubWiki() {
        // открыть страничку гитхаб
        open("https://github.com/selenide/selenide");
        // перейти на вики
        $("#wiki-tab").click();
        // Перейти в Soft assertions
        $("#wiki-body").$(byText("Soft assertions")).click();
        // Поиск строки Junit
        $(".gollum-markdown-content").shouldHave(text("JUnit5 extension - "),
                text("com.codeborne.selenide.junit5.SoftAssertsExtension"));
    }

}

