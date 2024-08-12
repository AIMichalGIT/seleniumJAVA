package JavaKurs.Webdrivers;

public class WebDriverSecondTest {
    public static void main(String[] args) {
//        InnyWebDriver chrome = new InnyWebDriver();
//        InnyWebDriver secondChrome = new ChromeDriver();
//
//        InnyWebDriver firefox = new FirefoxDriver();
//        InnyWebDriver firefoxSecond = new FirefoxDriver();


        InnyWebDriver safari = new InnyWebDriver() {
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
