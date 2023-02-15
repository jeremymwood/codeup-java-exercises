package shapes;

public class Square extends Rectangle {
    public double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        System.out.println("square perimeter");
        return side * 4;
    }

    @Override
    public double getArea() {
        System.out.println("square area");
        return side * side;
    }
}