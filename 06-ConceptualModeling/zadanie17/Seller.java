public class Seller {
    private int sellerId;
    private String name;
    private int age;

    public Seller(int sellerId, String name, int age) {
        this.sellerId = sellerId;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSellerId() {
        return sellerId;
    }

    void sellProduct() {

    }

    void recycleProduct() {

    }
}
