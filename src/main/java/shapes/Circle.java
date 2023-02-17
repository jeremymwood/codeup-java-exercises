package shapes;

public class Circle {
//***
//    1, should have a private radius field that is set through the constructor
//  ***properties***
    private double radius;


//  ***methods***
    //***
//  2, various methods for getting information about the circle:
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * (radius * radius);
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

//  ***getters and setters***
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
