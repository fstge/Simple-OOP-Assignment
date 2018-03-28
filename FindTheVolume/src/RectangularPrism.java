import java.util.Scanner;
public class RectangularPrism {
    double height;
    double length;
    double width;
    double volume;
    double surfaceArea;
    
    //constructor that doesn't really do anything but proves I know how they work
    public RectangularPrism(){
        //sets values to zero for no particular reason other than it's a requirement to pass
        height = 0;
        width = 0;
        length = 0; 
    }
    
    //gets the length width and height of the object
    public void getValues(){
        Scanner input = new Scanner (System.in);
        System.out.println("Please Enter the height of the rectangular prism");
        this.height = input.nextDouble();
        System.out.println("Please Enter the length of the rectangular prism");
        this.length = input.nextDouble();
        System.out.println("Please Enter the width of the rectangular prism");
        this.width = input.nextDouble();
        //simplifies the process
        calculateValues();
    }
    
    //takes length width and height to get surface area and volume
    //left public so that you can still get volume and surface area if values are changed manually within the code
    public void calculateValues(){
        this.volume = this.height*this.length*this.width;
        this.surfaceArea = (this.height*this.length + this.height*this.width + this.length * this.width)*2;
    }
    
    //simply displays the values of surface area and volume
    public void displayValues(){
        System.out.println("Surface Area : " + this.surfaceArea);
        System.out.println("Volume : " + this.volume);
    }
}
