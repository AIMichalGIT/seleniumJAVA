package Webdrivers;

public class WebDriverTest {
    //    public static void main(String[] args) {
//        ChromeDriver chrome = new ChromeDriver();
//        chrome.get("https:/udemy.com");
//        chrome.findElementBy("xPath");
//    }
    public static void main(String[] args) throws NoValidBrowserName {

        DriverType[] driverTypes = DriverType.values();
        for (int i = 0; i<driverTypes.length; i++) {
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }

        System.out.println("Wykonuję kod po przeczytaniu dostępnych driverów");

        WebDriver driver = getDriver(DriverType.CHROME);
        driver.get("https://www");
        driver.findElementBy("xPath");

//    FirefoxDriver firefox = new FirefoxDriver();
//    firefox.get();
//    firefox.findElementBy();
    }

    // z przekazaniem dowolnego stringa
//    private static WebDriver getDriver(String name) throws NoValidBrowserName {
//        if (name.equals("chrome")) {
//            return new ChromeDriver();
//        } else if (name.equals("firefox")) {
//            return new FirefoxDriver();
//        }
//        throw new NoValidBrowserName("Nie ma takiej przegladarki");
//    }

//    // z wykorzystaniem ENUMA
//    private static WebDriver getDriver(DriverType type) throws NoValidBrowserName {
//        if (type == DriverType.CHROME) {
//            return new ChromeDriver();
//        } else if (type == DriverType.FIREFOX) {
//            return new FirefoxDriver();
//        }
//        return null;
//    }

// z wykorzystaniem ENUMA podejscie cz2
private static WebDriver getDriver(DriverType type) {
    if (type.name.equals("chrome")) {
        System.out.println(type.path);
        return new ChromeDriver();
    }
    System.out.println(type.path);
    return new FirefoxDriver();

    }
}

