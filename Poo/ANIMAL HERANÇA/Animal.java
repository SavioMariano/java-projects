public class Animal {
    private  String Name;
    private  int Age;
    private  String Sound;

public Animal(String  Name,int Age, String Sound) {
    this.Name = Name;
    this.Age= Age;
    this.Sound = Sound;
}
public String introduce(){
    return "O nome do animal é " + this.Name + " ele tem " + this.Age + " e faz esse som :"+this.Sound+"\n";
} 
}
class Monkey extends Animal{
    public Monkey(String Name,int Age,String Sound){
    super(Name, Age, Sound);
}
public String jump(){
    return "Pulando de galho em galho";
}
}    

class Principal{ 
 public static void main (String [] args){
    Animal a1 = new Animal("little bird", 5, "chir chir");
    System.out.println("Informações sobre o animal: \n" +a1.introduce());

    Monkey Soin = new Monkey("Douglas", 2, "UH uH aH ah");
    System.out.println(Soin.introduce());
}
}



