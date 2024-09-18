package RahulCourse;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AutoSuggestive {


    public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

        System.setProperty
                ("webdriver.chrome.driver", "C:/Users/48883/Documents/Automatyzacja kurs/KursJavaSelenium/pliki/chromedriver-win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("autosuggest")).sendKeys("ind");

        Thread.sleep(3000);

        List<WebElement> options2 = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for (WebElement option : options2) {

            if (option.getText().equalsIgnoreCase("India")) {

                option.click();

                break;

            }

        }

    }


}


