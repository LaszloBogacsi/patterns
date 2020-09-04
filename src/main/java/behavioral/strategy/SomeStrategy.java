package behavioral.strategy;

public class SomeStrategy implements Strategy {
    @Override
    public void execute(String data) {
        System.out.println("data from some behavioral.strategy = " + data);
    }
}
