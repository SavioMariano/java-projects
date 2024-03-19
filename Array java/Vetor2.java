public class Vetor2 {
    public static void main(String[] args) {
    int[] num2 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    for (int i = num2.length -1; i >= num2[0]; i--){ // Conta os números de tŕa pra frente //
        System.out.print(num2[i] + "\n");			 // começa a contagem dos números de trás (num2. lenght - 1)
    }
}
}