package behavioral.strategy;

public class OtherStrategy implements Strategy {
    @Override
    public void execute(String data) {
        System.out.println("data from other behavioral.strategy = " + data);
    }
}
