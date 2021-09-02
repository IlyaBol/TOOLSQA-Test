package qaguru;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;


public class PracticeFormTests{

    @BeforeAll
    static void setUp() {
        Configuration.startMaximized = true;
    }

    @Test
    void Tests () {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Ilya");
        $("#lastName").setValue("Bogdanov");
        $("#userEmail").setValue("Bogdanov@gmail.com");
        $("#gender-radio-1").parent().click();
        $("#userNumber").setValue("8900000000");
        $("#dateOfBirthInput").click();
        //$x("//*[@class='react-datepicker__month-select'] /option[6]").click();
        $(".react-datepicker__month-select").$(byText("June")).click();
        $x("//*[@class='react-datepicker__year-select'] /option[text()=1989]").click();
        $x("//*[@class='react-datepicker__day react-datepicker__day--011 react-datepicker__day--weekend']").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $x("//div[@id='subjectsContainer']//input").setValue("Chemistry").pressEnter();
        $x("//div[@id='subjectsContainer']//input").setValue("Arts").pressEnter();
        $("#hobbies-checkbox-1").parent().click();
        $("#hobbies-checkbox-2").parent().click();
        $("#hobbies-checkbox-3").parent().click();
        $("#currentAddress").setValue("Gorkiy").pressEnter();
        $("#state").click();
        $("#state").$(byText("Haryana")).click();
        $("#city").click();
        $("#city").$(byText("Panipat")).click();
        $("#submit").click();

        // Проверки всех введеных значений

        $x("//td[text()='Student Name'] /following-sibling::td").shouldHave(text("Ilya Bogdanov"));
        $x("//td[text()='Student Email'] /following-sibling::td").shouldHave(text("Bogdanov@gmail.com"));
        $x("//td[text()='Gender'] /following-sibling::td").shouldHave(text("Male"));
        $x("//td[text()='Date of Birth'] /following-sibling::td").shouldHave(text("11 June,1989"));
        $x("//td[text()='Subjects'] /following-sibling::td").shouldHave(text("English, Chemistry, Arts"));
        $x("//td[text()='Hobbies'] /following-sibling::td").shouldHave(text("Sports, Reading, Music"));
        $x("//td[text()='Address'] /following-sibling::td").shouldHave(text("Gorkiy"));
        $x("//td[text()='State and City'] /following-sibling::td").shouldHave(text("Haryana Panipat"));

    }
}





