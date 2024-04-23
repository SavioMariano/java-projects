package ATV2_JAVA;

import java.time.LocalDate;

public class People {
    private String name;
    private int age;
    private String work;

    public People(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public static void main(String[] args) {
        People people1 = new People("João", 20, "Programador");
        System.out.println(people1.showInformations());
        System.out.println(people1.calcAgeinLeapYear());
    }

    public String showInformations(){
        return "Nome: " + this.name + "\nIdade: " + this.age + "\nTrabalho: " + this.work; 
    }

    public String calcAgeinLeapYear(){
        LocalDate currentYear = LocalDate.now();
        int year = currentYear.getYear();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return "É anobissexto e você tem " + this.age +" anos";
        }else {
            return "Não é anobissexto e você tem " + this.age +" anos";
        }
    }
}
