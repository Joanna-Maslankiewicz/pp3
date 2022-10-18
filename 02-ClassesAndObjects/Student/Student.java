public class Student {
    
    // wykaz atrybutów
    String name;
    int age;
    String studentIdCard;
    boolean isCardValid;
    int semesterNumber;
    double averageGrade;
    
    // wykaz metod
    public void sayHello() {
        System.out.println("Hello");
    };
    public void displayName() {
        System.out.println("My name is "+name);
    };
    public void displayAge() {
        System.out.println("My age is "+age);
    };
    public void displayNameSemesterGrade() {
        System.out.println("Name: "+name+". Semester number: "+semesterNumber+". Average grade: "+averageGrade);
    };
    public void changeStatusOfIdCard() {
        isCardValid = !isCardValid;
    };
    public void displayNameIdCardIsValid() {
        System.out.println("Name: "+name+". ID card number: "+studentIdCard+". is card valid? "+isCardValid);
    };
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Joanna";
        s1.age = 20;
        s1.studentIdCard = "222964";
        s1.isCardValid = true;
        s1.semesterNumber = 3;
        s1.averageGrade = 4.37;
        
        s1.displayNameSemesterGrade();
        s1.changeStatusOfIdCard();
        s1.displayNameIdCardIsValid();
    };
}