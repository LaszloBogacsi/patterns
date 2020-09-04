package behavioral.visitor;

public class Dot implements Shape {

    private final int id;
    private final int x;
    private final int y;

    public Dot(int id, int x, int y) {

        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }

    @Override
    public String toString() {
        return "Dot{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
