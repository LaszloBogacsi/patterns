package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape{
    private int id;
    private List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundShape(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }

    @Override
    public String toString() {
        return "CompoundShape{" +
                "id=" + id +
                ", children=" + children +
                '}';
    }
}
