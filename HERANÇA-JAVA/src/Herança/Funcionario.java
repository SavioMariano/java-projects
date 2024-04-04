package Herança;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa{
    private String Função;
    private Double  Salario;
    public Funcionario(String Name, int Birth,  String Função, Double Salario){
    super(Name, Birth);
    this.Função = Função;
    this.Salario = Salario;
    }
 
    public String SaudaçãoFunc(){
       LocalTime NowHour = LocalTime.now();
       String FormatHour = NowHour.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
       int hour = NowHour.getHour();
   
       if (hour >= 5 && hour <= 11) {
          return FormatHour + " Bom dia " + Name + " você tem " + CalcularIdade() + " anos, sua função é " + Função + " e você ira receber " + Salario;
       }else if (hour >= 12 && hour <= 18) {
           return FormatHour + " Bom tarde " + Name + " você tem " + CalcularIdade() + " anos, sua função é " + Função + " e você ira receber " + Salario;
       }else if (hour >= 19 && hour <= 23) {
           return FormatHour + " Boa noite " + Name + " você tem " + CalcularIdade() + " anos, sua função é " + Função + " e você ira receber " + Salario;
       }else if (hour >= 24 && hour <= 4){
           return FormatHour + " Boa madrugada " + Name + " você tem " + CalcularIdade() + " anos, sua função é " + Função + " e você ira receber " + Salario;
       }else{
           return "Não achamos seus dados...";
   }
 }
}