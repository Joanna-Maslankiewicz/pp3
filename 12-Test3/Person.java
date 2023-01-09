import javax.swing.plaf.synth.SynthSeparatorUI;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return (name.substring(0, 1).toUpperCase() + surname.substring(0, 1).toUpperCase());
    }

    public static void main(String[] args) {
        Person p1 = new Person("anna", "may");
        System.out.println(p1.toString());
    }
}