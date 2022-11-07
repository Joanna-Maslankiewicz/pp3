public class KelvinToCelsius {
    
    double Celsius;
    double Kelvin;
    
    public KelvinToCelsius(double k){
        Kelvin = k;
        Celsius = Kelvin-273.15;
    };
    
    public void displayData() {
        System.out.println(Kelvin+" Kelvin to Celsius is: "+Celsius);
    };
    
    public static void main(String[] args){
        KelvinToCelsius k1 = new KelvinToCelsius(0);
        
        k1.displayData();
    };
}