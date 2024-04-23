package ATV_JAVA;
public class Car {
    private String car_Brand;  //marca do carro
    private String car_Model;  // modelo do carro
    private int velocity;      // velocidade do carro.

    public Car(String car_Brand, String car_Model, int velocity) {
        this.car_Brand = car_Brand;
        this.car_Model = car_Model;
        this.velocity = velocity;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Fiat", "Argo", 50);
        car1.accelerate();
        System.out.println(car1.information());
    }

        //metodo pra informar atributos do carro.
    public String information(){  
        return "Marca do carro é " + this.car_Brand + " seu modelo é " + car_Model + " e ele está a " + getVelocity() +" km/h"; 
    }
        //metodo de aceleração
    public void accelerate(){
        velocity += 10;
        
    }
        //metodo para freiar o carro.
    public void Braking(){
        velocity -= 10;
    }
        //metodo get pra pegar a velocidade do carro
    public int getVelocity(){
        return velocity;
    }
}
