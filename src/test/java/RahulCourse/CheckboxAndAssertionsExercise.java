package RahulCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.List;

public class CheckboxAndAssertionsExercise {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty
                ("webdriver.chrome.driver", "C:/Users/48883/Documents/Automatyzacja kurs/KursJavaSelenium/pliki/chromedriver-win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());

        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();

        System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());

        Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        System.out.println("Number of checkboxes: " + checkboxes.size());

            }
}
