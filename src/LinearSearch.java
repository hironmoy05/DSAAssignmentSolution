public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {-12, 245, 2, 6, 7896};
        System.out.println(digits(arr[4]));
    }

    public static int findNumbers (int[] arr) {
        int count = 0;

        for (int n: arr) {
            if (even(n))
                count++;
        }

        return count;
    }

    private static boolean even(int num) {
        int numberOfDigits = digits2(num);

        return numberOfDigits % 2 == 0;
    }

    // optimized
    private static int digits2(int num) {
        if (num < 0)
            num = num * -1;

        if (num == 0)
            return 1;

        return (int)Math.log10(num) + 1;
    }
    private static int digits(int num) {
        if (num < 0)
            num = num * -1;

        if (num == 0)
            return 1;

        int count = 0;

        while (num > 0) {
            count++;

            num /= 10;
        }

        return count;
    }
}
