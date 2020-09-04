package behavioral.visitor;

public class PrintShapesVisitor implements Visitor{
    @Override
    public String visitDot(Dot d) {
        return d.toString();
    }

    @Override
    public String visitCircle(Circle circle) {
        return circle.toString();
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return rectangle.toString();
    }

    @Override
    public String visitCompoundShape(CompoundShape compoundShape) {
        return compoundShape.toString();
    }

    public void export(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.accept(this));
        }
    }
}
