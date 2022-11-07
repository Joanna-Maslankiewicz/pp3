public class KelvinToFahrenheit {
    
    double Fahrenheit;
    double Kelvin;
    
    public KelvinToFahrenheit(double k){
        Kelvin = k;
        Fahrenheit = ((Kelvin-273.15)*9/5)+32;
    };
    
    public void displayData() {
        System.out.println(Kelvin+" Kelvin to Fahrenheit is: "+Fahrenheit);
    };
    
    public static void main(String[] args){
        KelvinToFahrenheit k1 = new KelvinToFahrenheit(0);
        
        k1.displayData();
    };
}