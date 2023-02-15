package shapes;

public class Rectangle {

    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getPerimeter() {
        System.out.println("rectangle perimeter");
        return 2 * (width + length);
    }

    public double getArea() {
        System.out.println("rectangle area");
        return width * length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


}