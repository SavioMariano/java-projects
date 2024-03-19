public class Vetor3 {
    public static void main(String[] args){
    String[] Words = {"Sávio", "Wendel", "Larissa"};
    for (String word: Words){
    System.out.println("no nome " + word + " existem essas vogais: " );
    String vogais = word.replaceAll( "[^áéíóúaeiouAEIOU]", "");  //Substitui todas as consoantes por ""
    System.out.println(vogais); //Se removemos o "^" inves de excluir as consoantes vai ser as vogais
    }
    }
}
