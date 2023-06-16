import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.util.*;

public class Conditionals {

    // 1. Area Of Circle Java Program
    public static void areaOfCircle(int radius) {
        double area = Math.PI * radius * radius;

        System.out.println((float)area);
    }

    // 2. Area of Triangle
    public static void areaOfTriangle(double base, double height ) {
        double area = (base * height) / 2;

        System.out.println((float)area);
    }

    // 3. Area of rectangle
    public static void areaOfRectangle(double length, double width) {
        double area = length * width;

        String formattedArea = String.format("%.2f", area);

        System.out.println(formattedArea);
    }

    public static void areaOfIsosceles(double side, double base) {
        double area = (base * (Math.sqrt(4 * Math.pow(side, 2) - Math.pow(base, 2)))) / 4;

        String formattedArea = String.format("%.2f", area);

        System.out.println(formattedArea);
    }
    public static void areaOfParallelogram(double base, double side) {
        double area = base * side;

        String formattedArea = String.format("%.2f", area);

        System.out.println(formattedArea);
    }
    public static void areaOfRhombus(double diagonal1, double diagonal2) {
        double area = diagonal1 * diagonal2 / 2;

        String formattedArea = String.format("%.2f", area);

        System.out.println(formattedArea);
    }
    public static void areaOfEquilateralTriangle(double side) {
        double area = (Math.sqrt(3)/4) * Math.pow(side, 2);

        String formattedArea = String.format("%.3f", area);
        System.out.println(formattedArea);
    }

    public static void perimeterOfCircle(double radius) {
        double circumference = 2 * Math.PI * radius;

        String formattedCircumference = String.format("%.2f", circumference);
        System.out.println(formattedCircumference);
    }

    public static void perimeterOfEquilateralTriangle(double side) {
        double circumference = side * 3;

        String formattedCircumference = String.format("%.2f", circumference);
        System.out.println(formattedCircumference);
    }
    public static void perimeterOfParallelogram(double side1, double side2, double side3, double side4) {
        double circumference = side1 + side2 + side3 + side4;

        String formattedCircumference = String.format("%.2f", circumference);
        System.out.println(formattedCircumference);
    }
    public static void perimeterOfRectangle(double length, double breadth) {
        double circumference = (length * 2) + (breadth * 2);

        String formattedCircumference = String.format("%.2f", circumference);
        System.out.println(formattedCircumference);
    }

    public static void perimeterOfSquare(double side) {
        double circumference = side * 4;

        String formattedCircumference = String.format("%.2f", circumference);
        System.out.println(formattedCircumference);
    }
    public static void perimeterOfRhombus(double side) {
        double circumference = side * 4;

        String formattedCircumference = String.format("%.2f", circumference);
        System.out.println(formattedCircumference);
    }
    public static void volumeOfCone(double radius, double height) {
        double volume = (double) 1/3 * (Math.PI * Math.pow(radius, 2) * height);

        String formattedVolume = String.format("%.2f", volume);
        System.out.println(formattedVolume);
    }
    public static void volumeOfPrism(double length, double width) {
        double volume = length * width;

        String formattedVolume = String.format("%.2f", volume);
        System.out.println(formattedVolume);
    }

    public static void volumeOfCylinder(double radius, double height) {
        double volume = Math.PI * Math.pow(radius, 2) * height;

        String formattedVolume = String.format("%.2f", volume);
        System.out.println(formattedVolume);
    }
    public static void volumeOfSphere(double radius) {
        double volume = (double)4/3 * Math.PI * Math.pow(radius, 3);

        String formattedVolume = String.format("%.2f", volume);
        System.out.println(formattedVolume);
    }
    public static void volumeOfPyramid(double base, double height) {
        double volume = (double)1/3 * base * height;

        String formattedVolume = String.format("%.2f", volume);
        System.out.println(formattedVolume);
    }
    public static void curvedSurfaceAreaOfCylinder(double radius, double height) {
        double curvedSurfaceArea = 2 * Math.PI * radius * height;

        String formattedCurvedSurfaceArea = String.format("%.2f", curvedSurfaceArea);
        System.out.println(formattedCurvedSurfaceArea);
    }

    public static void totalSurfaceAreaOfCube(double side) {
        double totalSurfaceArea = 6 * Math.pow(side, 2);

        String formattedTotalSurfaceArea = String.format("%.2f", totalSurfaceArea);
        System.out.println(formattedTotalSurfaceArea);
    }

    public static void fibonacciSeries(int numOfTerms) {
        int start = 0;
        int end = 1;

        System.out.print(start + " " + end + " ");

        for (int i = 2; i < numOfTerms; i++) {
            int sum = start + end;

            System.out.print(sum + " ");
            start = end;
            end = sum;
        }
    }

    // Efficient way to find out fibonacci series through recursion
    public static int fibonacciSeries2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacciSeries2(n - 1) + fibonacciSeries2(n - 2);
    }

    // Subtract the Product and Sum of Digits of an Integer
    /*
        Input: n = 234
        Output: 15
        Explanation:
        Product of digits = 2 * 3 * 4 = 24
        Sum of digits = 2 + 3 + 4 = 9
        Result = 24 - 9 = 15
    */
    public static int productAndSum(int n) {
        int p = 1;
        int s = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            p *= lastDigit;
            s += lastDigit;

            n /= 10;
        }

        return p - s;
    }

    // Input a number and print all the factors of that number (use loops).
    public static void printFactors(int n) {
        if (n == 2) {
            System.out.println(n);
            return;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }

    // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    public static void printSum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while(true) {
            int n = scanner.nextInt();

            if (n == 0)
                break;

            sum += n;
        }

        System.out.println(sum);
    }

    // Take integer inputs till the user enters 0 and print the largest number from all.
    public static void largestNum() {
        Scanner scanner = new Scanner(System.in);
        int largestNumber = Integer.MIN_VALUE;

        while(true) {
            int n = scanner.nextInt();

            if (n == 0)
                break;

            if (n > largestNumber)
                largestNumber = n;
        }

        System.out.println(largestNumber);
    }

    // Intermediate
    // Factorial Program
    private static void factorial(int n) {
        if (n < 0)
            return;

        int result = 1;

        for (int i = 2; i <= n; i++)
                result *= i;

        System.out.println(result);
    }

//    Calculate Electricity Bill
    public static void electricBill(float unit, float rs) {
        if (unit <= 0 || rs <= 0)
            return;

        System.out.println(unit * rs);
    }

//    Calculate Discount Of Product
    public static void calculateDiscount(double price) {
        double discount = price * .08;
        double discountedPrice = price - (price * .08);

        System.out.println("Total Discount " + discount);
        System.out.println("Discounted Price " + discountedPrice);
    }

//    Calculate Commission Percentage
    public static void calculateCommissionPercentage(double totalAmount, double commissionAmount) {
        double commissionPercentage = (commissionAmount / totalAmount) * 100;

        System.out.println("Commission percentage " + String.format("%.2f", commissionPercentage) + "%");
    }

//    calculate power
    public static void power(int num, int p) {
        System.out.println(Math.pow(num, p));
    }

//    Calculate Depreciation of Value
    public static void calculateDepreciationValue(double initialPrice, double salvageValue, int usefulLifeYears) {
        double depreciationValue = (initialPrice - salvageValue) / usefulLifeYears;

        System.out.println("Depreciation value per year: " + depreciationValue);
    }

//    Calculate Batting Average
    public static void calculateBattingAverage(int totalRunsScored, int numberOfDismissals) {
        double battingAverage = (double)totalRunsScored / numberOfDismissals;

        System.out.println("Batting Average: " + battingAverage);
    }

    //    Calculate CGPA
    public static void calculateCGPA() {
        int creditHours1 = 3;
        int creditHours2 = 4;
        int creditHours3 = 3;
        int creditHours4 = 2;
        float course1GradePoints = 4.0F * creditHours1;
        float course2GradePoints = 3.0F * creditHours2;
        float course3GradePoints = 4.0F * creditHours3;
        float course4GradePoints = 2.0F * creditHours4;

        float totalGradePoints = course1GradePoints + course2GradePoints + course3GradePoints + course4GradePoints;
        int totalCreditHours = creditHours1 + creditHours2 + creditHours3 + creditHours4;

        double cgpa = (double)totalGradePoints / totalCreditHours;

        System.out.println("CGPA: " + String.format("%.2f", cgpa));
    }

    // Calculate compound Interest
    public static void calculateCompoundInterest(
            int principal,
            double annualInterestRate,
            int periodsPerYear,
            int numberOfYears) {

        double totalAmountAOfCompoundInterest = principal * Math.pow(1 + annualInterestRate / periodsPerYear, periodsPerYear * numberOfYears);

        System.out.println("Total amount of compound interest "+ String.format("%.2f", totalAmountAOfCompoundInterest));
    }

//    Calculate Average Marks
    public static void calculateAverageMarks(int[] marks) {
        double totalMarks = 0;

        for (int num: marks) {
            totalMarks += num;
        }

        double averageMarks = totalMarks / marks.length;

        System.out.println("Average marks: " + averageMarks);
    }

//    Find if a number is palindrome or not
    public static boolean isPalindrome(int n) {
        if (n <= 1)
            return true;

        ArrayList<Integer> arr = new ArrayList<>();
        while (n > 0) {
            int lastDigit = n % 10;
            arr.add(lastDigit);
            n /= 10;
        }

        int s = 0;
        int e = arr.size() - 1;

        while(s <= e) {
            if (!Objects.equals(arr.get(s), arr.get(e)))
                return false;

            s++;
            e--;
        }

        return true;
    }

    // optimized code to find whether its palindrome or not. This is not gonna add extra space. But both of them have
    // O(log10(n)) time complexity
    public static boolean isPalindrome2(int n) {
        if (n < 0)
            return false;

        int reverseNumber = 0;
        int originalNumber = n;

        while (n > 0) {
            int lastDigit = n % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            n /= 10;
        }

        return reverseNumber == originalNumber;
    }

//    HCF of two numbers by Euclidean Algorithm:
public static int findHCF(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

//    Prime Factorization:
//    The prime factorization method involves finding the prime factors of both numbers and then identifying the common factors.
    public static int findHCF2(int a, int b) {
        int smaller = Math.min(a, b);
        int hcf = 1;

        for (int i = 2; i <= smaller; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        return hcf;
    }

    // Find LCM
    public static int findLCM(int a, int b) {
        int hcf = findHCF(a, b);

        return (a * b) / hcf;
    }

    // Vowel or Constant
    public static void vowelOrConsonant(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            System.out.println(c + " is a vowel");
        else
            System.out.println(c + " is a consonant");
    }

    // Find perfect Number
    public static boolean perfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return num == sum;
    }

    // Check Leap year or not
    public static void isLeapYear(int year) {
        boolean divideBy4 = year % 4 == 0;
        boolean divideBy400 = year % 400 == 0;
        boolean divideBy100 = year % 100 != 0;

        if (divideBy4 && (divideBy400 || divideBy100))
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }

//    Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.August
    public static void numberOfDaysAllowedToGo(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year, month);
        int numberOfDaysInMonth = yearMonth.lengthOfMonth();
        int count = 0;

        for(int i = 1; i <= numberOfDaysInMonth; i++) {
            if (i % 2 != 0)
                count++;
        }

        System.out.println(count + " days he can go out in the month of " + yearMonth.getMonth());
    }

//    Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
    public static void sumOfNegNumPosEvenOddNum() {
        Scanner scanner = new Scanner(System.in);

        int sumOfNegativeNumbers = 0;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        while(true) {
            int num = scanner.nextInt();

            if (num == 0)
                break;
            else if (num < 0)
                sumOfNegativeNumbers += num;
            else if (num % 2 == 0)
                sumOfEvenNumbers += num;
            else sumOfOddNumbers += num;
        }

        System.out.println(
                "Sum of Negative Numbers: " + sumOfNegativeNumbers+"\n" +
                        "Sum of Even Numbers: " + sumOfEvenNumbers+"\n" +
                        "Sum of Odd Numbers: " + sumOfOddNumbers
        );
    }

//    public static int findCeiling(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        int mid = 0;
//
//        while (start <= end) {
//            mid = start + (end - start) / 2;
//
//            if (target == arr[mid])
//                return arr[mid];
//
//            if (target <= arr[mid])
//                end = mid - 1;
//            else
//                start = mid + 1;
//        }
//
//        return arr[start];
//    }

    public static void main(String[] args) {
        sumOfNegNumPosEvenOddNum();
    }

}
