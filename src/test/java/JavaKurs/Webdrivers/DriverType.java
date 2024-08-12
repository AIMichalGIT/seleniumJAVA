package JavaKurs.Webdrivers;

public enum DriverType {

    CHROME("chrome", "/src/resources/chromedriver.exe"),
    FIREFOX("firefox", "/src/resources/firefoxdriver.exe");

    String name;
    String path;

    private DriverType(String name, String path) {
        this.name = name;
        this.path = path;
    }
}
