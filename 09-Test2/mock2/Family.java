package mock2;

public class Family {
    public Person[] members;

    public Family(Person[] members) {
        this.members = members;
    }

    public int adult() {
        int countAdults = 0;
        for (Person person : members) {
            if (person.getAge() >= 18) {
                countAdults++;
            }
        }
        return countAdults;
    }

}
