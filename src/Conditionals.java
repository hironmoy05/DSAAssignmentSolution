import java.util.Arrays;
import java.util.Scanner;

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

    public static void main(String[] args) {
        int[] marks = {85, 90, 95, 91, 93};
        calculateAverageMarks(marks);
    }

}
