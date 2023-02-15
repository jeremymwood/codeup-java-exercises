package shapes;

public class Rectangle {

    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    };

    public static int getArea(int width, int height) {
        int area = width * height;
        System.out.printf("width: %s\nheight: %s\narea: %s\n\n", width, height, area);
        return area;
    }

    public static int getPerimeter(int width, int height) {
        int perimeter = 2 * (width + height);
        System.out.printf("width: %s\nheight: %s\nperimeter: %s\n\n", width, height, perimeter);
        return perimeter;
    }

}
