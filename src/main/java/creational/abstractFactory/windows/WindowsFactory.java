package creational.abstractFactory.windows;

import creational.abstractFactory.Button;
import creational.abstractFactory.Checkbox;
import creational.abstractFactory.GUIFactory;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
