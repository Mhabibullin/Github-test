package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FirstTest {

    @Test
    void shouldFindSelenideRepository(){
        open("https://github.com");
        $("[name=q]").setValue("selenide").pressEnter();
       var firstLinkFound=$$(".repo-list li").first().$("a");
       firstLinkFound.click();
        $("h1").shouldHave(text("selenide / selenide"));

    }
}
