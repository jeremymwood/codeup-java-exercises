package shapes;

public class Square extends Rectangle {

    protected int side;
////    @Override
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }


    public Square(int width, int height) {
        super(width, height);
    }
    @Override
    public void int getArea(int width, int height) {
    }
    @Override
    public void int getPerimeter(int width, int height) {
        int perimeter = 2 * (width + height);
        return perimeter;
    }
}