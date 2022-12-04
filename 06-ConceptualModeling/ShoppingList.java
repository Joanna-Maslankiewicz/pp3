import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    private ArrayList<String> products = new ArrayList<String>();

    void displayList() {
        System.out.println("Shopping list:");
        for (String product : products) {
            System.out.println("Product name : " + product);
        }
    }

    void displayNumOfProducts() {
        System.out.println("Number of products to be purchased : " + products.size());
    }

    void addProduct(String product) {
        products.add(product);
    }

    void addProduct() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter new product");
        String product = keyboard.next();
        products.add(product);
    }

    public static void main(String[] args) {
        ShoppingList s = new ShoppingList();
        s.displayList();
        s.displayNumOfProducts();
        s.addProduct();
        s.addProduct();
        s.addProduct();
        s.displayList();
        s.displayNumOfProducts();
        s.addProduct();
        s.displayList();
        s.displayNumOfProducts();
    }
}