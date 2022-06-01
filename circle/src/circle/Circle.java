package circle;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.println("Ch 6 Example - Circle - by Kevin Bell\n");
        Circle spot;
        spot = new Circle();

        System.out.println("Original circle");
        spot.initialize();
        spot.printCircleData();

        System.out.println("\nChanged circle");
        spot.setRadius(5);
        spot.printCircleData();
    }

}
