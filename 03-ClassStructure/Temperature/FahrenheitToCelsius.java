public class FahrenheitToCelsius {
    
    double Fahrenheit;
    double Celsius;
    
    public FahrenheitToCelsius(double f){
        Fahrenheit = f;
        Celsius = (Fahrenheit-32)*5/9;
    };
    
    public void displayData() {
        System.out.println(Fahrenheit+" Fahrenheit to Celsius is: "+Celsius);
    };
    
    public static void main(String[] args){
        FahrenheitToCelsius f1 = new FahrenheitToCelsius(100);
        
        f1.displayData();
    };
}