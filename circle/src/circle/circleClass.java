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
        System.out.printf("Radius: %-,10.3f\n", radius);
        System.out.printf("Diameter: %-,10.3f\n" , diameter);
        circumfrence = 2 * Math.PI * radius;
        System.out.printf("Circumfrence: %-,10.3f\n" ,circumfrence);
        area = Math.PI * radius * radius;
        System.out.printf("area: %-,10.3f\n",area);
    }
}
