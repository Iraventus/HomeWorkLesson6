import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @Test
    public void selenideSearch() {
        open("https://www.google.com/");
        $(By.name("q")).val("Selenide").pressEnter();
        $("#search").shouldHave(text("Selenide"));
    }
}
