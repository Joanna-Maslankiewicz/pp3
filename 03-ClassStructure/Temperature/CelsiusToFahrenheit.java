public class CelsiusToFahrenheit {
    
    double Celsius;
    double Fahrenheit;
    
    public CelsiusToFahrenheit(double c){
        Celsius = c;
        Fahrenheit = (Celsius*1.8)+32;
    };
    
    public void displayData() {
        System.out.println(Celsius+" Celsius to Fahrenheit is: "+Fahrenheit);
    };
    
    public static void main(String[] args){
        CelsiusToFahrenheit f1 = new CelsiusToFahrenheit(25);
        
        f1.displayData();
    };
}