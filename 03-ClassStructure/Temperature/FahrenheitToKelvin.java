public class FahrenheitToKelvin {
    
    double Fahrenheit;
    double Kelvin;
    
    public FahrenheitToKelvin(double f){
        Fahrenheit = f;
        Kelvin = (Fahrenheit+459.67)*0.55;
    };
    
    public void displayData() {
        System.out.println(Fahrenheit+" Fahrenheit to Kelvin is: "+Kelvin);
    };
    
    public static void main(String[] args){
        FahrenheitToKelvin f1 = new FahrenheitToKelvin(100);
        
        f1.displayData();
    };
}