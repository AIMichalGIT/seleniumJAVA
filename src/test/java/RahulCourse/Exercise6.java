package RahulCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Exercise6 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = DriverFactory.createDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // 1. select checkbox (any)

        driver.findElement(By.cssSelector("label[for='honda']")).click();

        // 2. grab the label from checkbox

        String labelbox = driver.findElement(By.cssSelector("label[for='honda']")).getText();

        // 3. select option from dropdown which equals to label from checkbox

        List<WebElement> dropdownOption = driver.findElements(By.cssSelector("select[id='dropdown-class-example'] option[value*=option]"));

        for (WebElement option : dropdownOption) {

            if (option.getText().equalsIgnoreCase(labelbox)) {

                option.click();

                break;

            }
        }
            // 4. enter the label in editbox

        driver.findElement(By.cssSelector("#name")).sendKeys(labelbox);

            // 5. click on alert and check if the label grabbed is present in the popup message

        driver.findElement(By.cssSelector("#alertbtn")).click();
        String alertLabel = driver.switchTo().alert().getText().split(",")[0].split(" ")[1].trim();
        if (alertLabel.equalsIgnoreCase(labelbox)) {
            System.out.println("alert shows correct label");
        }


        DriverFactory.tearDown();
        }

    }


