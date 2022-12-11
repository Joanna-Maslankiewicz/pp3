package project;

public class Publisher {
    private String name;
    private String city;

    public Publisher(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("City: " + getCity());
    }
}
