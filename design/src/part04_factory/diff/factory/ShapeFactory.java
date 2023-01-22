package part04_factory.diff.factory;

import part04_factory.diff.design.Shape;
import part04_factory.diff.shape_list.Circle;
import part04_factory.diff.shape_list.Rectangle;
import part04_factory.diff.shape_list.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType) {

        System.out.println("ShapeFactory..." + shapeType);

        switch (shapeType) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                return () -> {
                    System.out.println("존재하지 않는 모형입니다.");
                };
        }
    }
}
