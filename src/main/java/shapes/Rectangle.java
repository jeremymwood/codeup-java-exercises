package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double width, double length) {
        super(width, length);
    }

    public String secondGreeting() {
        return "I'm a Rectangle\n";
    }



//    @Override
//    void setWidth(double width) {
//
//    }
//
//    @Override
//    void setLength(double length) {
//
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 0;
//    }
//
//    @Override
//    public double getArea() {
//        return 0;
//    }

//    public double getPerimeter() {
//        System.out.println("rectangle perimeter");
//        return 2 * (width + length);
//    }
//
//    public double getArea() {
//        System.out.println("rectangle area");
//        return width * length;
//    }
//


}