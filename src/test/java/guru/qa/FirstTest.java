package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FirstTest {

    @Test
    void shouldFindSelenideRepository(){
        Selenide.open("https://github.com");
        $("[name=q]").setValue("selenide").pressEnter();
        $$(".repo-list li").first().$("a").click();
        $("h1").shouldHave(Condition.text("selenide / selenide"));

    }
}
