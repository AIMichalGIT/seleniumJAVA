package RahulCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SellIntroduction {

    public static void main(String[] args) {


        System.setProperty
                ("webdriver.chrome.driver", "C:/Users/48883/Documents/Automatyzacja kurs/KursJavaSelenium/pliki/chromedriver-win32/chromedriver.exe");

        // Tworzenie obiektu ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Dodawanie argumentu do opcji Chrome
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("start-maximized"); // Dodatkowy argument do maksymalizacji okna

        // Uruchomienie przeglądarki Chrome z niestandardowymi opcjami
        WebDriver driver = new ChromeDriver(options);

        //Firefox driver -> Gecko driver
//        System.setProperty
//                ("webdriver.gecko.driver", "C:/Users/48883/Documents/Automatyzacja kurs/KursJavaSelenium/pliki/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver;

        //Edge driver -> msEdge driver
//        System.setProperty
//                ("webdriver.edge.driver", "C:/Users/48883/Documents/Automatyzacja kurs/KursJavaSelenium/pliki/msedgedriver.exe");
//        WebDriver driver = new EdgeDriver;


        // Otwarcie strony
        driver.get("https://rahulshettyacademy.com/");

        // Wypisanie tytułu strony
        System.out.println(driver.getTitle());

        // Wypisanie adresu URL strony na której się znajdujemy
        System.out.println(driver.getCurrentUrl());

        // Zamykanie jedynie pierwotnie otwartego okna
        // driver.close

        // Zamykanie przeglądarki
        driver.quit();
    }

}
