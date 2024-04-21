package ATV_JAVA;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
}

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(6, 8, 9);
        System.out.println(triangle1.calcArea());

        System.out.println(triangle1.identifierTriangle());
    }


    public double calcArea(){
        double Semi_Perimer = (side1 + side2 + side3 )/2;
        double Area =  Math.sqrt(Semi_Perimer * (Semi_Perimer - side1) * (Semi_Perimer - side2) * (Semi_Perimer - side3));
        return Area;
    }

    public String identifierTriangle(){
        if (side1 == side2 && side2 == side3){
            return "é um triangulo equilatero";
        }else if ( side1 == side2 || side1 == side3 || side2 == side3) {
            return "é um triangulo isoceles";
        }else{
            return "é um triangulo escaleno";
        }
    }

}
