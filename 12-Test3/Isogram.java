public class Isogram {
    static boolean isogram(String s) {
        char[] c = s.toCharArray();
        for (char i : c) {
            int count = 0;
            for (char j : c) {
                if (i == j) {
                    count++;
                }
            }
            if (count == 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isogram("red sun"));
        System.out.println(isogram("blue water"));
        System.out.println(isogram("BLUE water"));
        System.out.println(isogram("my blue water"));
    }
}
