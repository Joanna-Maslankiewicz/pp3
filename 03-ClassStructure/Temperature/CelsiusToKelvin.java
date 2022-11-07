public class CelsiusToKelvin {
    
    double Celsius;
    double Kelvin;
    
    public CelsiusToKelvin(double c){
        Celsius = c;
        Kelvin = Celsius+273.15;
    };
    
    public void displayData() {
        System.out.println(Celsius+" Celsius to Kelvin is: "+Kelvin);
    };
    
    public static void main(String[] args){
        CelsiusToKelvin k1 = new CelsiusToKelvin(25);
        
        k1.displayData();
    };
}