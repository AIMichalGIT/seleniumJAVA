package RahulCourse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Exercise3SynchronizationWithExplicitWaitAssignement {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

       // WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        //Username
        WebElement credentialText = driver.findElement(By.xpath("//p[@class='text-center text-white']"));
        String fullText = credentialText.getText();
        String usernameToFill = extractValue(fullText, "username is", "and Password");
        String passwordToFill = extractValue(fullText, "Password is", ")");
        System.out.println("Extracted username: " + usernameToFill);
        driver.findElement(By.id("username")).sendKeys(usernameToFill);

        //Password
        System.out.println("Extracted password: " + passwordToFill);
        driver.findElement(By.id("password")).sendKeys(passwordToFill);

//        //Radiobutton User
//        driver.findElement(By.xpath("")).click();
//
//        //Dropdown Consultant
//        driver.findElement(By.xpath("")).click();
//
//        //Checkbox
//        driver.findElement(By.xpath("")).click();
//
//        //Sign in button
//        driver.findElement(By.xpath("")).click();

//        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
    }
    private static String extractValue(String text, String startKeyword, String endKeyword) {
        int startIndex = text.indexOf(startKeyword) + startKeyword.length();
        int endIndex = text.indexOf(endKeyword, startIndex);
        return text.substring(startIndex, endIndex).trim();
    }
}
