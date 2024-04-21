package ATV_JAVA;

public class Circle {
    private double length;
    private double radius;
    private double pi = 3.14;

    public static void main(String[] args) {
        Circle circle1 = new Circle(5, 5);
        
        System.out.println(circle1.calcPerimeter());

        System.out.println(circle1.calcRadius());
    }

    public Circle(double length,double radius){
        this.length = length;
        this.radius = radius;
    }

    public double calcPerimeter(){
        length = 2 * pi * radius;
        return length;
    }
 
    public double calcRadius(){
    double area =  pi * (radius* radius);
    return area;
    }
}
    