package shapes;

public class Square extends Rectangle {

    private int side;
    private int side2;

//    public Square(int side) {
//        this.side = side;
//    }
//    @Override
    public Square(int side) {
        super(side, side);
        this.side = side;
    }
}
