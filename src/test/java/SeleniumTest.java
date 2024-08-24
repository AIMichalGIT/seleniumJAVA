import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
    }

    // ścieżka do driver chrome: webdriver.chrome.driver
    // ścieżka do driver firefox: webdriver.gecko.driver

    @Test
    public void openGooglePage() {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\48883\\Documents\\Automatyzacja kurs\\KursJavaSelenium\\pliki\\chromedriver-win32\\chromedriver.exe");
        // System.setProperty("webdriver.gecko.driver", "C:\\Users\\48883\\Documents\\Automatyzacja kurs\\KursJavaSelenium\\pliki\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
