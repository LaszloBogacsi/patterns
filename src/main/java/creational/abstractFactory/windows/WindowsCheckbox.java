package creational.abstractFactory.windows;

import creational.abstractFactory.Checkbox;

/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is another variant of a checkbox.
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
