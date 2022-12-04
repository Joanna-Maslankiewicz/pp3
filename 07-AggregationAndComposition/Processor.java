public class Processor {
    private double clockSpeed;
    private double processSize;
    private String name;
    private String brand;
    private boolean isTurnedOn = false;

    Processor(double clockSpeed, double processSize, String name, String brand) {
        turnOn();
    }

    Processor() {
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public double getProcessSize() {
        return processSize;
    }

    public void setProcessSize(double processSize) {
        this.processSize = processSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }

    public void turnOn() {
        this.isTurnedOn = true;
    }

}