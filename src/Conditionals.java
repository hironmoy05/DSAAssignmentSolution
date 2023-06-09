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


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++)
            System.out.print(fibonacciSeries2(i) + " ");

    }
}
