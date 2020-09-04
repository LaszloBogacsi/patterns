package behavioral.command;

public class CopyCommand implements Command {
    private final Reciever reciever;
    private final String copyParameters;

    public CopyCommand(Reciever reciever, String copyParameters) {

        this.reciever = reciever;
        this.copyParameters = copyParameters;
    }

    @Override
    public void execute() {
        reciever.operation(copyParameters);
    }
}
