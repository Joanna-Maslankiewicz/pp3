public class ArithmeticMean {
    
    double X;
    static double Count = 0;
    static double Mean = 0;
    static double SumOfNumbers = 0;
    
    public ArithmeticMean(double x, double y){
        for(double X = x; x<=y; x++) {
            Count = Count + x;
            SumOfNumbers++;
        };
        Mean = Count/SumOfNumbers;
    };
    
    public void displayCount(){
        System.out.println("Arithmetic mean of numbers: "+Mean);
    };
    
    public static void main(String[] args){
        ArithmeticMean n1 = new ArithmeticMean(5,10);
        
        n1.displayCount();
    };
}