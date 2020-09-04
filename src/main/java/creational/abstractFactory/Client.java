package creational.abstractFactory;

import creational.abstractFactory.mac.MacOsFactory;
import creational.abstractFactory.windows.WindowsFactory;

/**
 * Abstract Factory is a creational design pattern, which solves the problem of creating entire product families without specifying their concrete classes.
 *
 * Application picks the factory type and creates it in run time (usually at
 * initialization stage), depending on the configuration or environment
 * variables.
 */
public class Client {
    private static GUIFactory factory;

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {

        final Application application;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOsFactory();
            application = new Application(factory);
        } else {
            factory = new WindowsFactory();
            application = new Application(factory);
        }
        return application;
    }
}
