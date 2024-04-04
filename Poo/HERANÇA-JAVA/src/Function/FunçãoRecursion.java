package Function;

//Exemplo de função que chama ela mesma
/*Nela temos uma váriavel int que tem o argumento 10 e abaixo na função ela recebe o metódo de 
 se ela for maior que 10 então ela vai somar com ela mesmo -1 no caso 10 + 9 e assim por diante
 até ela chegar em 0. */
public class FunçãoRecursion {
    public static void main(String[] args) {
      int result = sum(10);
      System.out.println(result);
    }
    public static int sum(int k) {
      if (k > 0) {
        return k + sum(k - 1);
      } else {
        return 0;
      }
    }
  }