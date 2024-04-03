
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Pessoa{
    private String Name;
    private int Birth;
    public String Apelido = "";

    public Pessoa(String Name, int Birth, String Apelido){
        this.Name = Name;
        this.Birth = Birth;
        this.Apelido = Apelido;
    }
    private int CalcularIdade(){
        LocalDate CurrentYear = LocalDate.now();
        int Year = CurrentYear.getYear();
        return Year-Birth;
    }
    public String Saudação(){
        LocalTime NowHour = LocalTime.now();
        String FormatHour = NowHour.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        int hour = NowHour.getHour();

        if (hour >= 5 && hour <= 11) {
        return FormatHour + " Bom dia me chamo " + this.Name + ", tenho " + CalcularIdade() + " anos e meu apelido é " + this.Apelido;
        } 
        else if (hour >= 12 && hour <= 18) {
        return FormatHour + " Boa tarde me chamo " + this.Name + ", tenho " + CalcularIdade() + " anos e meu apelido é " + this.Apelido;
        }
        else if (hour >= 19 && hour <= 23) {
        return FormatHour + " Boa noite me chamo " + this.Name + ", tenho " + CalcularIdade() + " anos e meu apelido é " + this.Apelido;
        }
        else if (hour >= 24 && hour <= 4){
        return FormatHour + " Boa madrugada me chamo " + this.Name + ", tenho " + CalcularIdade() + " anos e meu apelido é " + this.Apelido;
        }else{
            return "Não achamos";
        }
    }
    public static void main(String[] args) {
    Pessoa Tio = new Pessoa("Sávio", 2008, "Branquelo");
        System.out.println(Tio.Saudação());
}}