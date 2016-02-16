import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Parcel Cost Calculator");
  }

  @Test
  public void testShip() {
    goTo("http://localhost:4567/");
    fill("#length").with("5");
    fill("#width").with("5");
    fill("#height").with("5");
    fill("#distance").with("5");
    submit(".btn");
    assertThat(pageSource()).contains("Your height is: 5");
  }

  @Test
  public void testShipPrice() {
    goTo("http://localhost:4567/");
    fill("#length").with("5");
    fill("#width").with("5");
    fill("#height").with("5");
    fill("#distance").with("5");
    submit(".btn");
    assertThat(pageSource()).contains("Your Shipping cost is: $62");
  }
}
