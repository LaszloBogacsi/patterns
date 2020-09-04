package creational.abstractFactory.mac;


import creational.abstractFactory.Button;
import creational.abstractFactory.Checkbox;
import creational.abstractFactory.GUIFactory;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
