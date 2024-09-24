package RahulCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Exercise2UIDropdownsEditBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty
                ("webdriver.chrome.driver", "C:/Users/48883/Documents/Automatyzacja kurs/KursJavaSelenium/pliki/chromedriver-win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("start-maximized"); // Dodatkowy argument do maksymalizacji okna

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/angularpractice/"); //URL in the browser

        driver.findElement(By.cssSelector(".form-control[required][name='name']")).sendKeys("Michal");
        driver.findElement(By.cssSelector(".form-control[required][name='email']")).sendKeys("michal@test.pl");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234abcd");
        driver.findElement(By.cssSelector(".form-check-input#exampleCheck1")).isSelected();

        driver.findElement(By.xpath("////select[@class='form-control'] //option[text()='Female']")).click();

        driver.findElement(By.xpath("//label[@class='form-check-label' and @for='inlineRadio1' and text()='Student']")).click();
        driver.findElement(By.xpath("//input[@class='form-control' and @name='bday']")).sendKeys("01.02.1990");

        driver.findElement(By.cssSelector(".btn.btn-success[type='submit'][value='Submit']")).click();
    }
}
