package JavaKurs.Webdrivers;

public class WebDriverTest {
    //    public static void main(String[] args) {
//        ChromeDriver chrome = new ChromeDriver();
//        chrome.get("https:/udemy.com");
//        chrome.findElementBy("xPath");
//    }
    public static void main(String[] args) throws NoValidBrowserName {

        InnyDriverType[] driverTypes = InnyDriverType.values();
        for (int i = 0; i<driverTypes.length; i++) {
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }

        System.out.println("Wykonuję kod po przeczytaniu dostępnych driverów");

        InnyWebDriver driver = getDriver(InnyDriverType.CHROME);
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
private static InnyFirefoxDriver getDriver(InnyDriverType type) {
    if (type.name.equals("chrome")) {
        System.out.println(type.path);
        return new InnyFirefoxDriver();
    }
    System.out.println(type.path);
    return new InnyFirefoxDriver();

    }
}

