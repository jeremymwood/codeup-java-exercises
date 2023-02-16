package shapes;

public class Square extends Quadrilateral {

    protected double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public String secondGreeting() {
        return "I'm a Square\n";
    }

//    @Override
//    public double getPerimeter() {
//        return 0;
//    }
//
//    @Override
//    public double getArea() {
//        return 0;
//    }
//
//    @Override
//    void setWidth(double width) {
//
//    }
//
//    @Override
//    void setLength(double length) {
//
//    }


    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}