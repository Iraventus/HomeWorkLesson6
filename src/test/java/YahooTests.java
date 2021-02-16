import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YahooTests {

  @Test
  public void shouldFindSelenideInYahoo() {
    open("https://www.yahoo.com/");
    $("[name='p']").val("Selenide").pressEnter();
    $("#results").shouldHave(text("selenide.org"));
  }
}
