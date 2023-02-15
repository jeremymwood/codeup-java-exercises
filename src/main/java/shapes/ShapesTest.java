package shapes;

import static shapes.Rectangle.getArea;
import static shapes.Rectangle.getPerimeter;
//import static shapes.Square.getArea;
//import static shapes.Square.getPerimeter;

public class ShapesTest {



    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        Rectangle box2 = new Square(5);

        System.out.printf("box1\nwidth: %s, height: %s\n", box1.width, box1.height);
        getArea(box1.width, box1.height);
        getPerimeter(box1.width, box1.height);

        System.out.printf("box2\nside: %s\n", box2.side);
        getArea(box2.width, box2.height);
        getPerimeter(box2.width, box2.height);
//        getArea(4,10);
//        getPerimeter(2,4);

    }

}