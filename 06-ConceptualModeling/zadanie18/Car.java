public class Car {
    private String brand;
    private String model;
    private int currentSpeed;
    private String colour;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.currentSpeed = 0;
    }

    public String getBrand() {
        return brand;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    void driveCar(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    void stopDriving() {
        currentSpeed = 0;
    }

    public void displaySpeed() {
        System.out.println("Current speed: " + currentSpeed);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Volkswagen", "passat");
        Car c2 = new Car("Toyota", "corolla");

        c1.driveCar(200);
        c1.displaySpeed();
        c2.driveCar(60);
        c2.displaySpeed();
    }

}