package ATV_JAVA;


public class Student {
    private String name;
    private int registration;
    private double[] grades;
    private double sum = 0;

    public Student(String name, int registration, double[] grades){
        this.name = name;
        this.registration = registration;
        this.grades = grades;
    }

    public static void main(String[] args) {
        double[] grades = {5,7,9,5  };
        Student Student1 = new Student("Isabelly", 12896, grades);
        System.out.println(Student1.information());

        System.out.println(Student1.calcAverage());

        System.out.println(Student1.Situation());
    }

    public String information(){
        return "O número de mátricula é " + this.registration + " o aluno é " + this.name;
    }

    public double calcAverage(){
        for(int i = 0; i < grades.length; i++ ){
            sum += grades[i];
        }
        return sum / grades.length;
    }

    public String Situation(){
        if (calcAverage() >= 7) {
            return "O Aluno(a) "+ this.name + " foi aprovado";
        } else{
            return "O Aluno(a) "+ this.name + " foi reprovado" ;
        }
    }

}
