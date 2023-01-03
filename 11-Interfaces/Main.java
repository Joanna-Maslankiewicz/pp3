public class Main {
    public static void main(String[] args) {
        TV myTV = new TV();
        myTV.on();
        myTV.displayStatus();
        myTV.setChannel(15);
        myTV.setVolume(7);
        myTV.displayStatus();
        myTV.off();
        myTV.displayStatus();
    }

}
