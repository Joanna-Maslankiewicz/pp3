public class NumberOfItems {
    
    int X;
    static int Count = 0;
    
    public NumberOfItems(int x, int y){
        for(int X = x; x<=y; x++) {
            Count++;
        };
    };
    
    public void displayCount(){
        System.out.println("Number of items: "+Count);
    };
    
    public static void main(String[] args){
        NumberOfItems n1 = new NumberOfItems(5,10);
        
        n1.displayCount();
    };
}