import java.util.ArrayList;

public class ShoppingList {
    public Product product;
    ArrayList<Product> shoppingList = new ArrayList<Product>();
    public int countProducts = 0;

    public void add(Product product) {
        shoppingList.add(product);
        countProducts += product.getQuantity();
    }

    public int total() {
        return countProducts;
    }

    public String toString() {
        String list = "";
        for (Product product : shoppingList) {
            list += product.getName() + ",";
        }
        return list.substring(0, list.length() - 1);
    }

    // sprawdzenie
    public static void main(String[] args) {
        ShoppingList s1 = new ShoppingList();
        Product mleko = new Product("milk", 2);
        s1.add(mleko);
        Product jablko = new Product("apple", 4);
        s1.add(jablko);
        System.out.println("Lista produktów: " + s1.toString() + ". " + "Suma produktów: " + s1.total());

    }
}
