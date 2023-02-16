package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    //    ***properties***
    protected double width;
    protected double length;

    //    ***constructor***
    public Quadrilateral(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public double getArea() {
        return width * length;
    }

    public String greeting() {
        return "I'm a Quadrilateral";
    }

    public abstract String secondGreeting();


    //    ***getters and setters***
    public double getWidth() {
        return width;
    }

    //    todo
//    should be abstract
    public void setWidth() {
//        this.width = width;
    }

    public double getLength() {
        return length;
    }

    //    todo
//    should be abstract
    public void setLength() {
//        this.length = length;
    }
}
