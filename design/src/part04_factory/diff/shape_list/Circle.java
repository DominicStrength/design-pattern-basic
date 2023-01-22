package part04_factory.diff.shape_list;

import part04_factory.diff.design.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle...draw");
    }
}
