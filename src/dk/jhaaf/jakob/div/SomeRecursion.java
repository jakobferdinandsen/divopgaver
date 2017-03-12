package dk.jhaaf.jakob.div;

import java.util.Scanner;

/**
 * Created by jakob on 13-03-17.
 */
public class SomeRecursion {
    public static void main(String[] args) {
        SomeRecursion recursion = new SomeRecursion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int input = scanner.nextInt();
        System.out.println("Result: " + recursion.recurFunc(input));
    }

    public int recurFunc(int input) {
        if (input <= 2) {
            return input;
        }
        return 2 * recurFunc(input - 1) + recurFunc(input - 2) - recurFunc(input - 3);
    }

}
