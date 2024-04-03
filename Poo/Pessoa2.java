
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Pessoa2{
    protected String Name;
    protected int Birth;
    public String Apelido = "";

    public Pessoa2(String Name, int Birth){
        this.Name = Name;
        this.Birth = Birth;

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
    Pessoa Tio = new Pessoa("Sávio", 2008);
        System.out.println(Tio.Saudação());
}}

class Aluno extends Pessoa2{
    public Aluno(String Name, int Birth, int Matricula, String Curso){
    super(Name,Birth);
}
    @Override
    public String Saudação(){
    LocalTime NowHour = LocalTime.now();
    String FormatHour = NowHour.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    int hour = NowHour.getHour();

    if (hour >= 5 && hour <= 11) {
        return FormatHour + " Bom dia, meu nome é " + Name + "";
    }else if (hour >= 12 && hour <= 18) {
        return "ee";
    }else if (hour >= 19 && hour <= 23) {
        return "ee";
    }else if (hour >= 24 && hour <= 4){
        return "ue";
    }else{
        return "Não achamos";
}

    
    }
    public static void main(String[] args) {
        Aluno obj1 = new Aluno("Cesár", 2008, 20659, "Informática");
        System.out.println(obj1.Saudação());
    }
}