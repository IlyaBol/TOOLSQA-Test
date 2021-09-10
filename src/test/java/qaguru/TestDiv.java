package qaguru;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;

public class TestDiv {
    @Test
    void verificationDivAndH() {
        open("http://uitestingplayground.com/");
        // Первое значение отработает
        $("div h3").$(byText("Dynamic ID")).click();
        $("#navbarSupportedContent").$(byText("Home")).click();
        // Второе падает с ошибкой Element not found {div/h3}
        $("div").$("h3").$(byText("Dynamic ID")).click();
    }
}
