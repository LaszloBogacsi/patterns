package behavioral.visitor;

public interface Visitor {
    String visitDot(Dot d);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundShape(CompoundShape compoundShape);
}
