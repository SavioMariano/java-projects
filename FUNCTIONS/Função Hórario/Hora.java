import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Hora {
    public static void main(String[] args) {
        Saudar();
    }
    
    public static void Saudar(){

    LocalTime hora_atual = LocalTime.now();
    String horaformat = hora_atual.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    int hour = hora_atual.getHour();
        if (hour >= 5 && hour <= 11) {
            System.out.println(horaformat + " Bom dia!");
        } 
        else if (hour >= 12 && hour <= 18) {
            System.out.println(horaformat+ " Boa tarde!");            
        }
        else if (hour >= 19 && hour <= 23) {
            System.out.println(horaformat + "Boa noite!");
        }
        else if (hour >= 24 && hour <= 4){
            System.out.println(horaformat + " Vai dormir!" );
        }
    }
    
}
