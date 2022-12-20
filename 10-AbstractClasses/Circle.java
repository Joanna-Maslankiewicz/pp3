public class Circle {
    private int promien = 0;

    public Circle(int promien) {
        this.promien = promien;
    }

    public int getPromien() {
        return promien;
    }

    public void setPromien(int promien) {
        this.promien = promien;
    }

    public double area() {
        return Math.PI * this.promien * this.promien;
    }

    public double perimeter() {
        return 2 * Math.PI * this.promien;
    }
}
