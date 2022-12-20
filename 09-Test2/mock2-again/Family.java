public class Family {
    public Person[] members;

    public Family(Person[] members) {
        this.members = members;
    }

    public int adults() {
        int count = 0;
        for (Person person : members) {
            if (person.getAge() >= 18) {
                count++;
            }
        }
        return count;
    }
}
