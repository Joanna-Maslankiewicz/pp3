public class Rectangles {
    
    // wykaz atrybutów
    int width;
    int length;
    
    // wykaz metod
    public void dimension() {
        System.out.println(width+" x "+length);
    };
    public void perimeter() {
        System.out.println(2*width+2*length);
    };
    public void surfaceArea() {
        System.out.println(width*length);
    };
}