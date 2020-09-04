package creational.factory;

/**
 * Creator
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
abstract public class Dialog {

    public void renderWindow() {
        // ... other code ...
        Button button = createButton();
        button.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    protected abstract Button createButton(); // this is the factort method
}
