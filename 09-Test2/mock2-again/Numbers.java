import java.util.*;

public class Numbers {
    int a;
    int b;
    int c;
    int d;
    int e;

    public Numbers(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public boolean different() {
        int[] values = { a, b, c, d, e };
        Set<Integer> foundNums = new HashSet<Integer>();

        for (int value : values) {
            if (foundNums.contains(value)) {
                return false;
            }
            foundNums.add(value);
        }
        return true;
    }

    public static void main(String[] args) {
        Numbers n1 = new Numbers(9, 7, 4, 3, 7);
        System.out.println(n1.different());
    }

}
