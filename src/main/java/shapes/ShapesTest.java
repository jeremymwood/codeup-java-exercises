package shapes;


public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape1 = new Rectangle(4, 5);
        System.out.printf("""
                Area: %s, Perimeter: %s
                
                """, myShape1.getArea(), myShape1.getPerimeter());

        Measurable myShape2 = new Square(6);
        System.out.printf("""
                Area: %s, Perimeter: %s
                
                """, myShape2.getArea(), myShape2.getPerimeter());

    }
}