public class Main {
    public static void main(String[] args) {
        Customer c = new Customer(0, null, 0);
        Seller s = new Seller(0, null, 0);
        Product p = new Product(0, null, 0);

        c.buyProduct();
        c.returnProduct();

        s.sellProduct();
        s.recycleProduct();

        p.getName();
        p.getPrice();
    }
}
