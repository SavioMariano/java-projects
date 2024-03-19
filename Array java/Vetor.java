public class Vetor {
    public static void main(String[] args) {

        int[] num1 = {15};
        for (int vetor = 1; vetor <= num1[0]; vetor++ ){
            System.out.println(vetor);
        }
        // Outra forma
        
        int[] num2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for (int vetor2 : num2){ // ":" signfica para cada.
            System.out.println(vetor2);
        }
    }
}