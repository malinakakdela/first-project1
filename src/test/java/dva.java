import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dva {


    public static class firstTest {

        private final By LOCATOR_BY_ID = By.id("elementId");
        private final By LOCATOR_BY_NAME = By.name("elementName");
        private final By LOCATOR_BY_TAGNAME = By.tagName("nameOfTag");
        private final By LOCATOR_BY_CLASS = By.className("elementClassName");
        private final By LOCATOR_BY_XPATH = By.xpath(".//*[contains(@class, 'list-article__meta-info flex')]");

        private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@mode = 'primary']");

        @Test
        public void firstTest() {
            System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
            WebDriver browserWindow = new ChromeDriver();
            browserWindow.manage().window().maximize();
            browserWindow.get("http://tvnet.lv");

            WebDriverWait wait = new WebDriverWait(browserWindow, 10);
            
            wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));

            WebElement acceptBtn = browserWindow.findElement(ACCEPT_COOKIES_BTN);
            acceptBtn.click();
        }

    }
}