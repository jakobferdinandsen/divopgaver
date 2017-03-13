package dk.jhaaf.jakob.div;

import java.util.Scanner;

/**
 * Created by jakob on 13-03-17.
 */
public class SomeRecursion {
    private int recurCount;


    public static void main(String[] args) {

        SomeRecursion recursion = new SomeRecursion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int input = scanner.nextInt();
        System.out.println("Result: " + recursion.recurFunc(input));
    }


    public int recurFunc(int input) {
        recurCount++;
        if (input <= 2) {
            System.out.println(recurCount);
            System.out.println(input);
            System.out.println("Hit i <= 2");
            System.out.println();
            return input;
        }
        System.out.println(recurCount);
        System.out.println(input);
        System.out.println("Hit recursion");
        System.out.println();
        return recurFunc(input - 1) + recurFunc(input - 2);
    }

}
