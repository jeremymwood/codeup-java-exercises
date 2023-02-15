package shapes;

import static shapes.Rectangle.getArea;
import static shapes.Rectangle.getPerimeter;

public class ShapesTest {



    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);


        getArea(box1.width, box1.height);
        getArea(4,10);
        getPerimeter(2,4);

    }

}
