package Webdrivers;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get(String website) {
        System.out.println("Otwieram przeglądarkę Firefox" + website);
    }

    @Override
    public void findElementBy(String locator) {
        System.out.println("Znajduje element " + locator);
    }
}
