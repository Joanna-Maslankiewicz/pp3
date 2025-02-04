public class Number {
    private int system;
    private String value;

    public int getSystem() {
        return system;
    }

    public String getValue() {
        return value;
    }

    public void setSystem(int system) {
        this.system = system;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Number(int system, String value) {
        this.system = system;
        this.value = value;
    }

    public int get10() {
        String[] array = this.value.split("");
        int[] arr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.valueOf(array[i]);
        }

        double result = 0;
        double power = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == getSystem()) {
                return -1;
            } else {
                result += arr[i] * Math.pow(getSystem(), power);
                power--;
            }
        }
        return (int) result;
    }

    public static void main(String[] args) {
        Number n1 = new Number(5, "101");
        System.out.println(n1.get10());
        Number n2 = new Number(8, "10283");
        System.out.println(n2.get10());
    }
}
