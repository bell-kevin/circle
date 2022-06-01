package circle;
import java.util.Scanner;
public class circleClass {
    public double radius;
    Scanner computerKeyboardInput = new Scanner(System.in);
    public void setRadius(double radius) {
        this.radius = radius;
    }
     public void initialize(double radius) {
         System.out.println("Radius value? ");
         radius = computerKeyboardInput.nextDouble();
    }
}
