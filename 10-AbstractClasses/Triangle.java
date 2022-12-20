public class Triangle extends Shape {
    private int podstawa = 0;
    private int wysokosc = 0;
    private int bok1 = 0;
    private int bok2 = 0;

    public Triangle(int podstawa, int wysokosc, int bok1, int bok2) {
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    public int getBok1() {
        return bok1;
    }

    public int getBok2() {
        return bok2;
    }

    public void setBok1(int bok1) {
        this.bok1 = bok1;
    }

    public void setBok2(int bok2) {
        this.bok2 = bok2;
    }

    public int getPodstawa() {
        return podstawa;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setPodstawa(int podstawa) {
        this.podstawa = podstawa;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double area() {
        return 0.5 * this.wysokosc * this.podstawa;
    }

    public double perimeter() {
        return this.podstawa + this.bok1 + this.bok2;
    }
}
