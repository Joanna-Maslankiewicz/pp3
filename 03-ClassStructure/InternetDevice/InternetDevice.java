public class InternetDevice {
    
    String name;
    boolean connected;
    static int connectedDevices;
    
    public InternetDevice(String nazwa){
        name = nazwa;
    }
    
    public void connect() {
        connected = true;
        connectedDevices++;
    };
    
    public void disconnect() {
        connected = false;
        connectedDevices--;
    };
    
    public void isConnected() {
        System.out.println(connected);
    };
    
    public void displayStatus() {
        if(connected) {
            System.out.println("device "+ name +" is connected to the Internet");
        }
        else {
            System.out.println("device "+ name +" is disconnected to the Internet");
        };
    };
    
    public static void displayConnections() {
        System.out.println(connectedDevices);
    };
    
    public static void main(String[] args) {
        InternetDevice d1 = new InternetDevice("telefon");
        d1.connect();
        d1.displayStatus();
        InternetDevice d2 = new InternetDevice("laptop");
        d2.connect();
        d2.displayStatus();
        InternetDevice d3 = new InternetDevice("komputer");
        d3.connect();
        d3.displayStatus();
        InternetDevice d4 = new InternetDevice("iPad");
        d4.displayStatus();
        InternetDevice d5 = new InternetDevice("tablet");
        d5.displayStatus();
        
        displayConnections();
    };
}