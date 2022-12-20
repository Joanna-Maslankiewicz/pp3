public class Main_8_9_10 {
    public static void main(String[] args) {
        SMS s1 = new SMS("hej", 123456789);
        s1.send();

        Email e1 = new Email("hej", "przywitanie", "skhabvksudbfvk");
        e1.send();
    }
}
