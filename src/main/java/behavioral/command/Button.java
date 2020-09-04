package behavioral.command;

public class Button {
    private Command copyCommand;

    public void setCommand(Command copyCommand) {
        this.copyCommand = copyCommand;
    }

    public void clickButton() {
        copyCommand.execute();
    }
}
