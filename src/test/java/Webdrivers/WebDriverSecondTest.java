package Webdrivers;

public class WebDriverSecondTest {
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver firefoxSecond = new FirefoxDriver();


        WebDriver safari = new WebDriver() {
            @Override
            public void get(String website) {
                System.out.println("Opening page with Safari");
            }

            @Override
            public void findElementBy(String locator) {
                System.out.println("Finding element with Safari");
            }
        };

        safari.get("www.safari.check.com");
        safari.get("find by safari locator");
    }
}
