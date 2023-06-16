import java.util.Arrays;

public class Main {

    public static void printTriangle(int[] arr) {
        if (arr.length < 1)
            return;

        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++)
            newArr[i] = arr[i] + arr[i + 1];

        printTriangle(newArr);

        System.out.println(Arrays.toString(arr));
    }

    public static int min(int[] arr, int n) {
        // base case
        if (n == 1)
            return arr[0];

        return Math.min(arr[n - 1], min(arr, n - 1));
    }

    public static void changeName (String[] fullName) {
        fullName[0] = "Gaurav";
        fullName[1] = "Dhar";
    }

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void modifyPerson(Person p) {
        p.setName("Bob");
        p = new Person("Charlie");
    }

    static int x = 90;

    public static void printx() {
        System.out.println(x);
    }

    static void fun(int... val) {
        for (int n: val)
            System.out.print(n + " ");
    }

    public static boolean isArmStrong(int num) {
        int originalVal = num;
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit * lastDigit * lastDigit;
            num /= 10;
        }

        return sum == originalVal;
    }

    // Is Palindrome
    public static boolean isPalindrome(String str) { // O(n)
        StringBuilder stB = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            stB.append(str.charAt(i));
        }

        String str2 = stB.toString();

        return str.equals(str2);
    }

    public static boolean isPalindrome2(String str) { // O(n)
        int s = 0;
        int ed = str.length() - 1;

        while(s != ed) {
            if (str.charAt(s) != str.charAt(ed))
                return false;

            s++;
            ed--;
        }

        return true;
    }

    public static boolean isPalindrome3(String str, int s, int ed) { // O(logn)
        if (s >= ed)
            return true;

        if (str.charAt(s) != str.charAt(ed))
            return false;

        return isPalindrome3(str, s + 1, ed - 1);
    }


//    Find Ncr & Npr
public static long calculateCombination(int n, int r) {
    long numerator = factorial(n);
    long denominator = factorial(r) * factorial(n - r);
    return numerator / denominator;
}

    public static long calculatePermutation(int n, int r) {
        long numerator = factorial(n);
        long denominator = factorial(n - r);
        return numerator / denominator;
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Reverse a string
    public static void reverseString(String str) {
        String[] strArr = str.split("");
        StringBuilder reverse = new StringBuilder();

        for (int i = strArr.length - 1; i >= 0; i--)
            reverse.append(strArr[i]);

        System.out.println(reverse.toString());
    }

    public static void reverseString2(String str) {
        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        reverseString2("Hello");
    }
}