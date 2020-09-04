package creational.factory;

/**
 * Concrete Creator
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
