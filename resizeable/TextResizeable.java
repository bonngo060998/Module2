package resizeable;

public class TextResizeable {
    public static void main(String[] args) {
        Shape[] shapearray = new Shape[3];
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        shapearray[0] = rectangle;
        shapearray[1] = square;
        shapearray[2] = circle;

        System.out.println ("Before: ");
        for (Shape shape : shapearray) {
            System.out.println (shape.toString ( ));
        }
        rectangle.resize (8);
        square.resize (6);
        circle.resize (6);

        System.out.println ("After: ");
        for (Shape shape : shapearray) {
            System.out.println (shape.toString ( ));
        }

    }
}
