package JavaKurs.Webdrivers;

public class ChromeDriver implements InnyWebDriver {
    @Override
    public void get(String website) {
        System.out.println("Otwieram przeglądarkę Chrome " + website);
    }

    @Override
    public void findElementBy(String locator) {
        System.out.println("Znajduję element za pomocą przeglądarki Chrome " + locator);
    }
}
