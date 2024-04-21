package ATV_JAVA;

public class Employee {
    private String name;
    private int salary;
    private int discount = 50;
    private String Position;
    
    
    public Employee(String name, int salary, String Position){
        this.name = name;
        this.salary = salary;
        this.Position = Position;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Bianca", 1600, "Progamador");
        System.out.println(employee1.information());
    }

    
    public String information(){
        return "O Funcionário(a) " + this.name + " está no cargo de " + this.Position + " e recebe " + calcNetSalary();
    }

    public double calcNetSalary(){
        salary = (salary - discount); 
        return salary;
    }
}
