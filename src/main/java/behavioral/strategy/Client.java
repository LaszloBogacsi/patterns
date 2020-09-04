package behavioral.strategy;

/**
 *  The Strategy pattern is very common in Java code. It’s often used in various frameworks to provide users a way to change the behavior of a class without extending it.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new SomeStrategy());
        context.doSomething();

        context.setStrategy(new OtherStrategy());
        context.doSomething();
    }
}
