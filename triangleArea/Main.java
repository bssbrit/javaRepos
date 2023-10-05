
/**
 Write a program that calculates the 
  of a rectangle using the length and width provided by the user as input.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lapiz = new Scanner(System.in);

        System.out.println("Qual a base");
        double x = lapiz.nextDouble();
        System.out.println("Qual a altura");
        double y = lapiz.nextDouble();

        area(x, y);
    }

    public static void area(double x, double y) {
        System.out.println("altura:" + x);
        System.out.println("base" + y);
        System.out.println(x * y);
    }
}