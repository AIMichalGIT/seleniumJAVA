package RahulCourse;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;


public class Exercise4WindowHandling {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.cssSelector("a[href='/windows']")).click();


        driver.findElement(By.xpath("//div[@class='example']//a[text()='Click Here']")).click();

        Set<String> windows = driver.getWindowHandles(); //[parentid,childid]

        Iterator<String> it = windows.iterator();

        String parentId = it.next();

        String childId = it.next();

        driver.switchTo().window(childId);

        String ChildText = driver.findElement(By.xpath("//div[@class='example']//h3[text()='New Window']")).getText();
        System.out.println("child text is: " + ChildText);

        driver.switchTo().window(parentId);

        String parentIdText = driver.findElement(By.cssSelector("div#content div.example h3")).getText();

        System.out.println("parentId text is :" + parentIdText);

    }

}


