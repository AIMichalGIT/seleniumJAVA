package RahulCourse;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;


public class Locators3 {


    public static void main(String[] args) {

// TODO Auto-generated method stub

//implicit wait - 2 seconds time out

        System.setProperty
                ("webdriver.chrome.driver", "C:/Users/48883/Documents/Automatyzacja kurs/KursJavaSelenium/pliki/chromedriver-win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("start-maximized"); // Dodatkowy argument do maksymalizacji okna
        WebDriver driver = new ChromeDriver(options);

// Sibling - Child to parent traverse

//header/div/button[1]/following-sibling::button[1]

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());


        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());


    }


}


