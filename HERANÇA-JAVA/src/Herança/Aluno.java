package Herança;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Aluno extends Pessoa{
    private int Matricula;
    private String Curso;
     public Aluno(String Name, int Birth, int Matricula, String Curso){
     super(Name,Birth);
     this.Matricula = Matricula;
     this.Curso = Curso;
 }
     public String SaudaçãoAluno(){
     LocalTime NowHour = LocalTime.now();
     String FormatHour = NowHour.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
     int hour = NowHour.getHour();
 
     if (hour >= 5 && hour <= 11) {
         return  FormatHour + " Boa tarde " + Name + ", seu número de matricula é " + Matricula + " você tem " + CalcularIdade() + " anos e está no curso de " + Curso;
     }else if (hour >= 12 && hour <= 18) {
         return FormatHour + " Boa tarde " + Name + ", seu número de matricula é " + Matricula + " você tem " + CalcularIdade() + " anos e está no curso de " + Curso;
     }else if (hour >= 19 && hour <= 23) {
         return FormatHour + " Boa noite " + Name + ", seu número de matricula é " + Matricula + " você tem " + CalcularIdade() + " anos e está no curso de " + Curso;
     }else if (hour >= 24 && hour <= 4){
         return FormatHour + " Boa madrugada " + Name + ", seu número de matricula é " + Matricula + " você tem " + CalcularIdade() + " anos e está no curso de " + Curso;
     }else{
         return "Não achamos seus dados...";
 }
     }
}