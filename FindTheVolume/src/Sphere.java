public class Sphere {
    double radius;
    double surfaceArea;
    double volume;
    // a cunstructor that actually does something
    public Sphere(double rad){
        this.radius = rad;
    }
    
    public void calculateValues(){
        this.surfaceArea = 4*3.14*this.radius*this.radius;
        this.volume = (this.radius*this.radius*this.radius)*(4/3)*3.14;
    }
    
    public void displayValues(){
        System.out.println("The volume of the sphere is " + this.volume);
        System.out.println("The surface area of the sphere is " + this.surfaceArea);
    }
}
