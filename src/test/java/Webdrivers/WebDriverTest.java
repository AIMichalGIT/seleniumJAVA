package Webdrivers;

public class WebDriverTest {
//    public static void main(String[] args) {
//        ChromeDriver chrome = new ChromeDriver();
//        chrome.get("https:/udemy.com");
//        chrome.findElementBy("xPath");
//    }
public static void main(String[] args) throws NoValidBrowserName {
    WebDriver driver = getDriver("chromea");
    driver.get("https://www");
    driver.findElementBy("xPath");

//    FirefoxDriver firefox = new FirefoxDriver();
//    firefox.get();
//    firefox.findElementBy();
}

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("Nie ma takiej przegladarki");
    }
}

