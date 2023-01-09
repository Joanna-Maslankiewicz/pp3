public class Numbers implements Ok {
    private int[] integers;

    public Numbers(int[] integers) {
        this.integers = integers;
    }

    public boolean ok() {
        for (int i = 0; i < integers.length - 1; i++) {
            if (i % 2 == 0) {
                if (integers[i] % 2 != 0) {
                    return false;
                }
            } else if (i % 2 != 0) {
                if (integers[i] % 2 == 0) {
                    return false;
                }
            } else {
                continue;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Numbers n1 = new Numbers(new int[] { 6, 7, 6, 1, 4 });
        Numbers n2 = new Numbers(new int[] { 2, 5, 2, 8, 4 });

        System.out.println(n1.ok());
        System.out.println(n2.ok());
    }
}
