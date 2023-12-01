import java.util.ArrayList;

public record Order(ArrayList<Product> products) {
    public static void main(String[] args) {
        ArrayList<Product> lista1 = new ArrayList<>();
        Product jajka1 = new Product("jajka",7);
        Product mleko1 = new Product("mleko",3.5);
        Product kawa1 = new Product("kawa",19.9);
        lista1.add(jajka1);
        lista1.add(mleko1);
        lista1.add(kawa1);
        Order order1 = new Order(lista1);
        System.out.println(order1.totalValue());
    }
    public double totalValue(){
        double total = 0;
        for (Product product: products) {
            total += product.Price();
        }
        return total;
    }
}
record Product(String name, double Price){

}