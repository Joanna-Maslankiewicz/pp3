public class Customer {
    private int customerId;
    private String name;
    private int age;

    public Customer(int customerId, String name, int age) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    void buyProduct() {

    }

    void returnProduct() {

    }
}
