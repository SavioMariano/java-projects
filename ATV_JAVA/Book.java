package ATV_JAVA;

public class Book {
    private String title;
    private String autor;
    private int pages;
    private boolean available;

    public Book(String title, String autor, int pages) {
        this.title = title;
        this.autor = autor;
        this.pages = pages;
        this.available =true;
    }

    public static void main(String[] args) {
        Book book1 = new Book("A Escrava Isaura", "Bernardo Guimarães", 200);
        System.out.println(book1.information());
        System.out.println(book1.avaiableBook());
        System.out.println(book1.borrowBook());
        System.out.println(book1.avaiableBook());
        System.out.println(book1.returnBook());
        System.out.println(book1.avaiableBook());
    }

    public String information(){
        return "O autor " + this.autor + " escreveu o livro " + this.title + " e ele possui " + this.pages +" páginas";
    }

    public String avaiableBook(){
        if (available) {
            return "O livro "+ this.title + " está disponivel";
        }else{
            return "O livro "+ this.title + " está indisponivel";
        }
    }

                //borrowing signfica emprestar
    public String borrowBook(){
        if (available) {
            available = false;
            return "O livro " + this.title + " foi emprestado";
        }else{
            return "O livro " + this.title + " não foi emprestado, pois não está disponivel";
        }
    }

    public String returnBook(){
        // o "!" faz o papel de diferente então se avaiable for diferente ele é false
        if (!available) {
            available = true;
            return "O livro" + this.title + " foi devolvido.";
        }else{
            return "O livro" + this.title + " já está disponivel";
    }

}
}
