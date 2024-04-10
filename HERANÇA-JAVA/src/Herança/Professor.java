package Herança;

public class Professor extends Aluno{
    private int Formação;
    public Professor(String Name, int Birth, String Curso, int Matricula, int Formação){
    super(Name,Birth,Matricula,Curso);   
    this.Formação = Formação;
    }
    @Override
    public String Saudação(){
    String Saudation = super.Saudação();
    return Saudation + " tenho " + this.Formação + " anos";
 }
}
