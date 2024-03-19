import java.util.Scanner;
public class Vetor4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int[][] students = new int [10][4]; //primeiro array é os alunos e o segundo é os bimestres
        double[] media =  new double[10]; // ira armazenar a média dos alunos
        
        // Utilizando um loop alinhado para inserir as 4 notas dos 10 alunos
        for (int stud=0 ; stud < 10 ; stud++){
            for (int grade =0; grade <4; grade ++){
                System.out.println("Ponha a nota do " + (stud + 1) + "° aluno no bimestre "+ (grade+1));
                students[stud][grade] = read.nextInt();  
            }

            for (int grades = 0; grades < 10; grades ++){ //calcula a média dos 4 bimestres
                media[grades] = (students[grades][0] + students[grades][1] +students[grades][2] +students[grades][3])/4;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (media[i] >= 7) { //se as notas forem maior ou igual a 7 vão ser printadas
        System.out.print("As maiores médias são: ");
        System.out.println("A média do " + (i + 1) + "° aluno que é: " + media[i]);
        }
    }
    read.close();
}
}
