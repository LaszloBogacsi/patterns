package creational.factory;

/**
 * concrete Creator
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
