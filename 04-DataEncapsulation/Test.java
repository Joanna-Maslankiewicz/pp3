public class Test {
    public static void main(String[] args) {
        DrivingLicense l1 = new DrivingLicense();
        l1.setName("jOAnna");
        l1.setSurname("Maślankiewicz");
        l1.setAddress("Jana Kaczary 9/54");
        l1.setPostalCode("31-421");
        l1.setCity("Kraków");
        l1.setLicenseNumber("123456");
        l1.setYearOfIssue(2022);
        l1.setLicenseCategory("B");

        l1.toString();
        l1.display();
    }
}
