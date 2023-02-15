package shapes;

public class Rectangle {

    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void int getArea(int width, int height) {
        int area = width * height;
        System.out.printf("area: %s\n",area);
        return area;
    }

    public void int getPerimeter(int width, int height) {
        int perimeter = 2 * (width + height);
        System.out.printf("perimeter: %s\n\n",perimeter);
        return perimeter;
    }

}