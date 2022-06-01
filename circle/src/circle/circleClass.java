package circle;

import java.util.Scanner;

public class circleClass {

    public double radius, diameter, circumfrence, area;
    Scanner computerKeyboardInput = new Scanner(System.in);

    //Constructor
    public circleClass() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void initialize() {
        System.out.print("Please enter the radius: ");
        radius = computerKeyboardInput.nextDouble();
    }

    public void printCircleData() {
        diameter = radius * 2;
        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        circumfrence = 2 * Math.PI * radius;
        System.out.println("Circumfrence: " +circumfrence);
        area = Math.PI * radius * radius;
        System.out.println("area: " +area);
    }
}
