package qaguru;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;

class Practice {
    @Test
    void TestDragAndDrop() {
        open("http://uitestingplayground.com/");
        // Первое значение отработает
        $("div h3").$(byText("Dynamic ID")).click();
        // Второе падает с ошибкой Element not found {div/h3}
        $("div").$("h3").$(byText("Dynamic ID")).click();
    }
}
