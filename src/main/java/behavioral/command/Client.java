package behavioral.command;


/**
 * The Command pattern is pretty common in Java code. Most often it’s used as an alternative for callbacks to parameterizing UI elements with actions.
 * It’s also used for queueing tasks, tracking operations history, etc.
 */
public class Client {
    public static void main(String[] args) {
        Reciever reciever = new Reciever();
        Command copyCommand = new CopyCommand(reciever, "copy parameters");

        Button copyButton = new Button();
        copyButton.setCommand(copyCommand);

        copyButton.clickButton();
    }
}
