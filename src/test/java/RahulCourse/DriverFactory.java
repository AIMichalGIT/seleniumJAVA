package RahulCourse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    private static WebDriver driver;

    // Metoda do tworzenia i konfigurowania WebDrivera
    public static WebDriver createDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-search-engine-choice-screen");
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    // Metoda do zamykania przeglądarki
    public static void tearDown() {
        if (driver != null) {
            driver.quit();  // Zamknięcie wszystkich okien przeglądarki
            driver = null;  // Resetowanie instancji WebDrivera
        }
    }
}
