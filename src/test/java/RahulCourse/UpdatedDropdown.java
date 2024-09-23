package RahulCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UpdatedDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty
                ("webdriver.chrome.driver", "C:/Users/48883/Documents/Automatyzacja kurs/KursJavaSelenium/pliki/chromedriver-win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("start-maximized"); // Dodatkowy argument do maksymalizacji okna
        options.addArguments("--disable-notifications"); // Zablokowanie powiadomień

        WebDriver driver = new ChromeDriver(options);

        driver.get("http://spicejet.com"); //URL in the browser


        System.out.println(driver.findElement(By.cssSelector(".css-1dbjc4n.r-11u4nky.r-z2wwpe.r-1phboty.r-rs99b7.r-1loqt21.r-13awgt0.r-ymttw5.r-5njf8e.r-1otgn73")).getAttribute("style"));
        driver.findElement(By.cssSelector(".css-1dbjc4n.r-11u4nky.r-z2wwpe.r-1phboty.r-rs99b7.r-1loqt21.r-13awgt0.r-ymttw5.r-5njf8e.r-1otgn73")).click();
        System.out.println(driver.findElement(By.cssSelector(".css-1dbjc4n.r-11u4nky.r-z2wwpe.r-1phboty.r-rs99b7.r-1loqt21.r-13awgt0.r-ymttw5.r-5njf8e.r-1otgn73")).getAttribute("style"));

    }
}
