package behavioral.strategy;

public class Context {

    private Strategy someStrategy;

    public void setStrategy(Strategy someStrategy) {

        this.someStrategy = someStrategy;
    }

    public void doSomething() {
        someStrategy.execute("context data");
    }
}
