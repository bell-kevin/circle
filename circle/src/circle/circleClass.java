package circle;
import java.util.Scanner;
public class circleClass {
    public double radius, diameter, circumfrence, area;
    Scanner computerKeyboardInput = new Scanner(System.in);
    
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
     public void initialize(double radius) {
         System.out.println("Radius value? ");
         radius = computerKeyboardInput.nextDouble();
         this.radius = radius;
    }
     
     public void printCircleData(double radius) {
         diameter = radius *2;
         System.out.println(diameter);
         circumfrence = 2* Math.PI * radius;
         System.out.println(circumfrence);
         area = Math.PI * radius * radius;
         System.out.println(area);
    }
     
     
     
}
