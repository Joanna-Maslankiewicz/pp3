public class Books {
    
    // wykaz atrybutów
    String tytul;
    int data_wydania;
    String autor;
    String kolor_okladki;
    
    // wykaz metod
    public void open() {
        System.out.println("otwórz");
    };
    public void close() {
        System.out.println("zamknij");
    };
    public void read() {
        System.out.println("czytaj");
    };
}