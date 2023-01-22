package part04_factory.diff;

import part04_factory.diff.design.Shape;
import part04_factory.diff.factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
    }
}
