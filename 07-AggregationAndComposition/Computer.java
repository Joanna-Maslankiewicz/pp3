public class Computer {
    private String name;
    private String system;
    private int version;
    private boolean isTurnedOn = false;
    private Processor processor = new Processor();

    public Computer(String name, String system, int version, Processor processor) {
        this.name = name;
        this.system = system;
        this.version = version;
        this.processor = processor;
        this.isTurnedOn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
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

    public void turnOff() {
        this.isTurnedOn = false;
        processor.setTurnedOn(false);
    }

    @Override
    public String toString() {
        return "Computer [name=" + name + ", system=" + system + ", version=" + version + ", isTurnedOn=" + isTurnedOn
                + ", processor=" + processor + "]";
    }

    public static void main(String[] args) {
        Computer c1 = new Computer("Komputer - Amelia", "windows", 11, new Processor(2.0, 4.0, "i5", "intel"));

        c1.turnOn();
        System.out.println(c1.toString());
        c1.turnOff();
        System.out.println(c1.toString());

    }

}