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
}
class SearchTests {
    @Test
    void Tests () {

        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Ilya");
        $("#lastName").setValue("Bogdanov");
        $("#userEmail").setValue("Bogdanov@gmail.com");
        $("#gender-radio-1").parent().click();
        $("#userNumber").setValue("99990999");
        $("#dateOfBirthInput").click();
        $x("//*[@class='react-datepicker__month-select'] /option[6]").click();
        $x("//*[@class='react-datepicker__year-select'] /option[text()=1989]").click();
        $x("//*[@class='react-datepicker__day react-datepicker__day--011 react-datepicker__day--weekend']").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $x("//div[@id='subjectsContainer']//input").setValue("Chemistry").pressEnter();
        $x("//div[@id='subjectsContainer']//input").setValue("Arts").pressEnter();
        $("#hobbies-checkbox-1").parent().click();
        $("#hobbies-checkbox-2").parent().click();
        $("#hobbies-checkbox-3").parent().click();
        $("#currentAddress").setValue("Нижний Новгород").pressEnter();
        $("#currentAddress").setValue("One love").pressEnter();
        $("#state").click();
        $("#state").$(byText("Haryana")).click();
        $("#city").click();
        $("#city").$(byText("Panipat")).click();
        $("#submit").click();


    }

}





