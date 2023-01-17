package crg.rla.ArraysChallengeExercise9122;

import java.util.Arrays;
import java.util.Random;

public class Main { //Episode 9.122: Arrays Challenge Exercise

    public static void main(String[] args) {
        int[] pog = getRandIntArray(12);
        System.out.println(Arrays.toString(pog));
        Arrays.sort(pog);
        int[] wog = new int[pog.length];
        for (int i = 0; i <  pog.length; i++) {
            wog[i] = pog[pog.length - 1 - i];
        }
        pog = wog;
        System.out.println(Arrays.toString(pog));
    }

    public static int[] getRandIntArray(int length) {

        Random rand = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50);
        }

        return array;
    }

}
