public class Lamps {
    
    // wykaz atrybutów
    boolean isLampOn;
    
    // wykaz metod
    public void switchOn() {
        isLampOn = true;
    };
    public void switchOff() {
        isLampOn = false;
    };
    public void checkLamp() {
        System.out.println(isLampOn);
    };
}