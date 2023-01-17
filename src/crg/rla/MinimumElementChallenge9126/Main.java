package crg.rla.MinimumElementChallenge9126;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[] numbers = readIntegers(args[1]);
        int[] numbers = readIntegers();
        System.out.println(Arrays.toString(numbers));
        System.out.println("The minimum element in is: " + findMin(numbers));
    }

    private static int[] readIntegers(String input) {
        String[] toConvert = input.split(",");
        int[] converted = new int[toConvert.length];

        for (int i = 0; i < converted.length; i++) {
            converted[i] = Integer.parseInt(toConvert[i].trim());
        }

        return converted;
    }

    private static int[] readIntegers() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter any Int, separated by commas: ");
        String input = s.nextLine();

        return readIntegers(input);
    }

    private static int findMin(int[] collection) {
        int lowest = collection[0];

        if (collection.length > 1) {
            for (int i = 1; i <  collection.length; i++) {
                if (lowest > collection[i]) {
                    lowest = collection[i];
                }
            }
        }

        return lowest;
    }

}
