package circle;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.println("Ch 6 Example - Circle - by Kevin Bell\n");
        circleClass spot;
        double radius=0;
        spot = new circleClass();

        System.out.println("Original circle");
        spot.initialize(radius);
        spot.printCircleData(radius);

        System.out.println("\nChanged circle");
        spot.setRadius(5);
        spot.printCircleData(radius);
    }
}
