public class Counters {
    
    //wykaz atrybutów
    int value;
    int initialValue = 0;
    
    // wykaz metod
    public void increase1() {
        value = value+1;
    };
    public void decrease1() {
        value = value-1;
    };
    public void increase10() {
        value = value+10;
    };
    public void decrease10() {
        value = value-10;
    };
    public void reset() {
        value = initialValue;
    };
}