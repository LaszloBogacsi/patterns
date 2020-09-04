package creational.factory;

/**
 * Factory method is a creational design pattern which solves the problem of creating product objects without specifying their concrete classes.
 */
public class Client {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    private static void configure() {
        if(!System.getProperty("os.name").equalsIgnoreCase("windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
}
