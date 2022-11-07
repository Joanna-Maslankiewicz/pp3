public class Room{
    int number;
    int beds;
    boolean occupied;
    String guestName;

    Room(int number){
        this.number = number;
        this.beds = 2;
    };

    Room (int number, int beds){
        this.beds = beds;
        this.number = number;
    };

    public String toString(){
        return 
            "Room Number : " + this.number + 
            ", Number of beds : " + this.beds + 
            ", is Occupied? : " + this.occupied + 
            ", Guest name : " + this.guestName;
    };

    void checkin(String guestName){
        this.occupied = true;
    };

    void checkout(){
        this.occupied = false;
    };

    boolean isOccupied() {
        return occupied;
    };

    static void displayRoomsReport(Room[] rooms){
        for (Room room : rooms){
            System.out.println(room.toString());
        };
        System.out.println(""); 
    };

    static void displayRoomsReportWithBeds(Room[] rooms, int specified_number_od_beds){
        for (Room room : rooms){
            if (room.beds == specified_number_od_beds){
                System.out.println( room.toString());
            }
        };
        System.out.println("");
    };

    static void displayRoomsReportOccupation(Room[] rooms){
        int num_of_free_rooms = 0;
        int num_of_occupied_rooms = 0;

        for (Room room : rooms){    
            if (room.occupied)
            {num_of_occupied_rooms ++;}
            else 
            {num_of_free_rooms++;}
        };
            
        System.out.println("Number of occupied rooms : " + num_of_occupied_rooms);
        System.out.println("Number of vacant rooms : " + num_of_free_rooms);
        System.out.println("");
    };

    public static void main (String[] args){
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Room r3 = new Room(3);
        Room r4 = new Room(4, 3);
        Room r5 = new Room(5, 3);
        Room r6 = new Room(6, 1);

        Room[] rooms = {r1, r2, r3, r4, r5, r6};

        System.out.println(r1.toString());
        System.out.println("");

        Room.displayRoomsReport(rooms);
        Room.displayRoomsReportWithBeds(rooms, 3);
        Room.displayRoomsReportOccupation(rooms);
    };
}