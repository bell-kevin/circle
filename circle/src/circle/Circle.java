package circle;

public class Circle {

    public static void main(String[] args) {
        System.out.println("Ch 6 Example - Circle - by Kevin Bell\n");
        circleClass spot;
        spot = new circleClass();
        System.out.println("Original circle");
        spot.initialize();
        spot.printCircleData();
        System.out.println("\nChanged circle");
        spot.setRadius(5);
        spot.printCircleData();
    }
}
