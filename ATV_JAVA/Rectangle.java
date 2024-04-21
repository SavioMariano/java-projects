package ATV_JAVA;

public class Rectangle {
    private double height; //altura
    private double width; // largura

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.calcArea());

        System.out.println(rectangle.calcPerimeter());
    }

    public double calcArea(){
        double area =  width * height;
        return area;
    }

    public double calcPerimeter(){
        double perimeter = 2 * (width + height);
        return perimeter;
    }
}
