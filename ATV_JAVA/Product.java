package ATV_JAVA;

public class Product {
    private int id_product;
    private double price;
    private double stock;

    public Product(int id_product, double price, double stock) {
        this.id_product = id_product;
        this.price = price;
        this.stock = stock;
    }

    public static void main(String[] args) {
        Product product1 = new Product(79723, 9.00, 900);
        System.out.println(product1.information());

        System.out.println(product1.calcTotal());
    }
    
    public String information(){
        return "O id do seu produto é " + this.id_product + " ele custa " + this.price + " R$ e temos " + this.stock + " no estoque.";
    }

    public String calcTotal(){
        if (stock >= 1) {
            double valueTotal = price * stock;
        return "Valor total do Estoque: " + valueTotal + " R$";
        }else{
            return "O estoque do " + this.id_product + " acabou." ;
        }
    }
}