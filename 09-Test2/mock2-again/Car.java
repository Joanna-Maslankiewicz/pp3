public class Car extends Vehicle {
    int maxSpeed;

    public Car(int s, int maxSpeed) {
        super(s);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec() {
        int[] specs = new int[2];
        specs[0] = getSeats();
        specs[1] = maxSpeed;
        return specs;
    }

    public static void main(String[] args) {
        Car c = new Car(4, 80);
        for (int i : c.spec()) {
            System.out.println(i);
        }
    }

}
