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
        System.out.println("Result: "+ recursion.recursiveFunction(input));
    }

    public int recursiveFunction(int input){
        if (input <= 2){
            return input;
        }
        return 2*recursiveFunction(input-1)+recursiveFunction(input-2)-recursiveFunction(input-3);
    }

}
