package resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapesarray = new Shape[3];

        Circle circle = new Circle ();
        Square square = new Square ();
        Rectangle rectangle = new Rectangle ();

        shapesarray[0] = circle;
        shapesarray[1] = square;
        shapesarray[2] = rectangle;

        System.out.println ("Before resize: ");
        for (Shape shape : shapesarray) {
            System.out.println (shape.toString ());
        }

        circle.resize (2);
        rectangle.resize (2);
        square.resize (2);

        System.out.println ("After resize: ");
        for (Shape shape : shapesarray) {
            System.out.println (shape.toString ());
        }

    }
}
