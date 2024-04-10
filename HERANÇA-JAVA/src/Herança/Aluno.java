package Herança;

public class Aluno extends Pessoa{
    private int Matricula;
    private String Curso;
     public Aluno(String Name, int Birth, int Matricula, String Curso){
     super(Name,Birth);
     this.Matricula = Matricula;
     this.Curso = Curso;
 }
    @Override
     public String Saudação(){
     String Saudation = super.Saudação();
     return  Saudation + " minha matricula é " + this.Matricula + " e meu curso é " + this.Curso;
     }
}
