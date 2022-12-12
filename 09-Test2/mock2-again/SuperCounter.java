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

    public static void main(String[] args) {
        SuperCounter s1 = new SuperCounter(48);
        s1.addN(60);
        System.out.println(s1.getCounter());
    }
}
