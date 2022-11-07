public class SumOfNumbers {
    
    int X;
    static int Count = 0;
    
    public SumOfNumbers(int x, int y){
        for(int X = x; x<=y; x++) {
            Count = Count + x;
        };
    };
    
    public void displayCount(){
        System.out.println("Sum of numbers: "+Count);
    };
    
    public static void main(String[] args){
        SumOfNumbers n1 = new SumOfNumbers(5,10);
        
        n1.displayCount();
    };
}