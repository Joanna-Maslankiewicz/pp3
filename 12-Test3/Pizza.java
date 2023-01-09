public class Pizza extends Food implements Extra {
    private int size;

    public Pizza(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public void setPrice() {
        setPrice(getSize() - 10);
    }

    public float discount() {
        if (getPrice() >= 30) {
            return 0.05f * getPrice();
        } else {
            return getPrice();
        }
    }

    public float delivery() {
        if (getSize() < 50) {
            return 6;
        } else {
            return 8;
        }
    }

    public float delivery(float tip) {
        return delivery() + tip;
    }

}
