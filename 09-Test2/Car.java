public class Car extends Vehicle {
    int maxSpeed;

    public Car(int seats, int maxSpeed) {
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec() {
        int[] specs = new int[2];
        specs[0] = getSeats();
        specs[1] = maxSpeed;
        return specs;
    }

    // sprawdzenie
    public static void main(String[] args) {
        Car c = new Car(7, 300);
        for (int i : c.spec()) {
            System.out.println(i);
        }
    }

}
