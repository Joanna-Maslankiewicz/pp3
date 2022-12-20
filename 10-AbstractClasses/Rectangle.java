public class Rectangle extends Shape {
    private int bokA = 0;
    private int bokB = 0;

    public int getBokA() {
        return bokA;
    }

    public int getBokB() {
        return bokB;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }

    public Rectangle(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public double area() {
        return this.bokA * this.bokB;
    };

    public double perimeter() {
        return (2 * this.bokA) + (2 * this.bokB);
    }
}
