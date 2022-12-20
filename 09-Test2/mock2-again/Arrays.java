public class Arrays {

    public static boolean arr(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;

        for (int value : arr1) {
            if (value > 9 && value < 100) {
                sum1++;
            }
        }
        for (int value : arr2) {
            if (value > 9 && value < 100) {
                sum2++;
            }
        }

        if (sum1 == sum2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean a1 = arr(new int[] { 15, 8, 2, 37, 49, 117 }, new int[] { 9, 6, 7, 12, 48, 4, 6, 90, 5 });
        System.out.println(a1);
    }
}
