package creational.abstractFactory;


/**
 * The client code calls the creation methods of a factory object instead of creating products directly with a constructor call (new operator).
 * Since a factory corresponds to a single product variant, all its products will be compatible.
 *
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
