public class Main_5_6_7 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 4);
        System.out.println("prostokąt - pole: " + r1.area() + ", obwód: " + r1.perimeter());

        Triangle t1 = new Triangle(4, 2, 2, 5);
        System.out.println("trójkąt - pole: " + t1.area() + ", obwód: " + t1.perimeter());

        Circle c1 = new Circle(5);
        System.out.println("koło - pole: " + c1.area() + ", obwód: " + c1.perimeter());
    }
}
