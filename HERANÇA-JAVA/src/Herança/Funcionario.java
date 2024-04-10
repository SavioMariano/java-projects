package Herança;

public class Funcionario extends Pessoa{
    private String Função;
    private Double  Salario;
    private int Matricula;
    public Funcionario(String Name, int Birth,  String Função, Double Salario, int Matricula){
    super(Name, Birth);
    this.Função = Função;
    this.Salario = Salario;
    this.Matricula = Matricula;
    }
    @Override
    public String Saudação(){
    String Saudation = super.Saudação();
    return Saudation + " minha função é " + this.Função + " e ganho " + this.Salario + " meu número de matricula é " + this.Matricula;
 }
}
