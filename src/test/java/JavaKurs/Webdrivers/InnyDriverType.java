package JavaKurs.Webdrivers;

public enum InnyDriverType {

    CHROME("chrome", "/src/resources/chromedriver.exe"),
    FIREFOX("firefox", "/src/resources/firefoxdriver.exe");

    String name;
    String path;

    private InnyDriverType(String name, String path) {
        this.name = name;
        this.path = path;
    }
}
