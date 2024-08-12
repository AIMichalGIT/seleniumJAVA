package JavaKurs;

public class AppChecker {

    public static void main(String[] args) {
        AndroidApp android = new AndroidApp("Calculator");
        android.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("Calculator2");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();
    }
}
