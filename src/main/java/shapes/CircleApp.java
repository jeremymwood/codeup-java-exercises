package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
//***
//    3, prompts the user for the radius of the circle using your Input class
        Input input = new Input();
        System.out.println("make a circle");

        do {
        System.out.println("radius?");
        double radius = input.getDouble();

            //  4, create a Circle object, and displays the circumference and area
        Circle myCircle = new Circle(radius);
        System.out.printf("""
                Circle with:
                Radius %s
                Area %s
                Circumference %s
                
                """, myCircle.getRadius(), myCircle.getArea(), myCircle.getCircumference());

        input.getString();

        boolean done = input.yesNo();
            System.out.println("Quit? (y/n)");
        if(done) {
//            System.out.println("you made" + Circle.getCircleCounter() + "circles.");
            break;
        }

        } while (true);
    }
}
