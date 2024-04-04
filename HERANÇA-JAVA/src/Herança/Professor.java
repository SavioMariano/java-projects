package Herança;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Professor extends Aluno{
    private int Formação;
    public Professor(String Name, int Birth, String Curso, int Matricula, int Formação){
    super(Name,Birth,Matricula,Curso);   
    this.Formação = Formação;
    }
    public String SaudaçãoProfessor(){
       LocalTime NowHour = LocalTime.now();
       String FormatHour = NowHour.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
       int hour = NowHour.getHour();
   
       if (hour >= 5 && hour <= 11) {
          return FormatHour + " Bom dia " + Name + " você tem " + CalcularIdade() + " anos e " + Formação + " anos de Formação.";
       }else if (hour >= 12 && hour <= 18) {
           return FormatHour + "Bom tarde " + Name + " você tem " + CalcularIdade() + " anos e " + Formação + " anos de Formação.";
       }else if (hour >= 19 && hour <= 23) {
           return FormatHour + "Boa noite " + Name + " você tem " + CalcularIdade() + " anos e " + Formação + " anos de Formação.";
       }else if (hour >= 24 && hour <= 4){
           return FormatHour + "Boa madrugada " + Name + " você tem " + CalcularIdade() + " anos e " + Formação + " anos de Formação.";
       }else{
           return "Não achamos seus dados...";
   }
 }
}