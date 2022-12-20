package mock2;

public class SuperCounter extends Counter {
    public Counter counter;

    public SuperCounter(int counter) {
        super(counter);
    }

    public void addN(int n) {
        int i = 0;
        while (i < n) {
            add1();
            i++;
        }
    }

    // sprawdzenie
    public static void main(String[] args) {
        SuperCounter s1 = new SuperCounter(123);
        s1.addN(100);
        System.out.println(s1.getCounter());
    }

}
