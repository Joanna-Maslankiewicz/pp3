public class CinemaTicket {
    
    // wykaz atrybutów
    static String cinemaName;
    String filmTitle;
    int row;
    int seat;
    double price;
    
    // wykaz metod
    
    public CinemaTicket(String f, int r, int s){
        filmTitle = f;
        row = r;
        seat = s;
        if (r<=2){
            price = 10;
        } else {
            price = 25;
        }
    };
    public void displayData() {
        System.out.println(cinemaName+", "+filmTitle+", "+row+", "+seat+", "+price);
    };
    public static void main(String[] args){
        CinemaTicket.cinemaName = "Morning Star Cinema";
        CinemaTicket t1 = new CinemaTicket("Gladiator",2,20);
        CinemaTicket t2 = new CinemaTicket("Gladiator",7,30);
        
        t1.displayData();
        t2.displayData();
    };
}