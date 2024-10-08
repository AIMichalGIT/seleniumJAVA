package RahulCourse;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;


public class Frames {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://jqueryui.com/droppable/");

        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0);
//        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        a.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();

    }

}


