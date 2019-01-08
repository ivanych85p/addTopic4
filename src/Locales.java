import java.util.Locale;
import java.util.ResourceBundle;

public class Locales {
    public static void main(String[] args) {
        Locale rus = new Locale("ru","RU");
        Locale bel = new Locale("be","BY");
        Locale eng = new Locale("en","GB");

        ResourceBundle bundleEn = ResourceBundle.getBundle("messages", eng);
        ResourceBundle bundleRus = ResourceBundle.getBundle("messages", rus);
        ResourceBundle bundleBel = ResourceBundle.getBundle("messages", bel);

        System.out.println(bundleEn.getString("greetings"));
        System.out.println(bundleRus.getString("greetings"));
        System.out.println(bundleBel.getString("greetings"));

        Locale.setDefault(new Locale("en","GB"));
        ResourceBundle bundleDefault = ResourceBundle.getBundle("messages");
        System.out.println(bundleDefault.getString("greetings"));
    }
}
