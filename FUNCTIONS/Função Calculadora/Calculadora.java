import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Calc();
    }
    public static void Calc(){
    Scanner read = new Scanner(System.in);

        //cumprimento
        System.out.println("Olá, bem vindo a calculadora do PP");
        System.out.println("Escolha os numeros e operadores\n");

        //Escolha do Usuário

        System.out.println("Escolha um número:");
        float num1 = read.nextFloat();
        System.out.println("\nEscolha um número:");
        float num2 = read.nextFloat();
        
        System.out.println("Ecolha o operador \n\n1- Soma 2- Subtração 3- Multiplicação 4- Divisão\n");
        float escolha = read.nextFloat();

        if(escolha == 1){
            System.out.println("Resultado:\n" + (num1+num2));
        }else if(escolha == 2){
            System.out.println("Resultado:\n"+ (num1-num2));
        }else if (escolha == 3){
            System.out.println("Resultado:\n"+ (num1*num2));
        }else if (escolha == 4){
            System.out.println("Resultado:\n"+ (num1/num2));
        }else{
            System.out.println("opcão inválida");
        }
    read.close();
    }
 }

