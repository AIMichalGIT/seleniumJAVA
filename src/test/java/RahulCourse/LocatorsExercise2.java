package RahulCourse;
import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class LocatorsExercise2 {



    public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

//implicit wait - 2 seconds time out

        System.setProperty
                ("webdriver.chrome.driver", "C:/Users/48883/Documents/Automatyzacja kurs/KursJavaSelenium/pliki/chromedriver-win32/chromedriver.exe");

        // Tworzenie obiektu ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Dodawanie argumentu do opcji Chrome
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("start-maximized"); // Dodatkowy argument do maksymalizacji okna

        // Uruchomienie przeglądarki Chrome z niestandardowymi opcjami
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys("rahul");

        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

        driver.findElement(By.className("signInBtn")).click();


    }
}