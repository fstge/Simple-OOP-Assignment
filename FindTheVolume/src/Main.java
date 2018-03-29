import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        RectangularPrism r1 = new RectangularPrism();
        r1.getValues();
        //r1.calculateValues();
        r1.displayValues();
        Scanner input = new Scanner (System.in);
        System.out.println("What is the radius of the sphere");
        Sphere s1 = new Sphere(input.nextDouble());
        s1.calculateValues();
        s1.displayValues();
        
    }
    
}
