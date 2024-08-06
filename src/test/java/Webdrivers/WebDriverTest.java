package Webdrivers;

public class WebDriverTest {
    public static void main(String[] args) {
        ChromeDriver chrome = new ChromeDriver();
        chrome.get("https:/udemy.com");
        chrome.findElementBy("xPath");
    }
}
