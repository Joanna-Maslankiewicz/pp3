import java.util.*;

public class ShoppingList {
    public Product product;
    ArrayList<Product> prodList = new ArrayList<Product>();
    int numOfProducts = 0;

    public void add(Product product) {
        prodList.add(product);
        numOfProducts += product.getQuantity();
    }

    public String toString() {
        String list = "";
        for (Product product : prodList) {
            list += product.getName() + ",";
        }
        return list.substring(0, list.length() - 1);
    }

    public int total() {
        return numOfProducts;
    }

    public static void main(String[] args) {
        ShoppingList s1 = new ShoppingList();
        Product mleko = new Product("milk", 2);
        s1.add(mleko);
        Product jablko = new Product("apple", 4);
        s1.add(jablko);
        System.out.println("Lista produktów: " + s1.toString() + ". " + "Suma produktów: " + s1.total());
    }
}
