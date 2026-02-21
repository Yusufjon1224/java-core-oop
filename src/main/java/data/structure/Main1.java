package data.structure;

import java.util.Arrays;
import java.util.Random;

public class Main1 {

    public static void main(String[] args) {

        int [] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondary = new int[10];
        System.out.println(Arrays.toString(secondary));
        Arrays.fill(secondary, 5);
        System.out.println(Arrays.toString(secondary));

        int [] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println("Third array =" + Arrays.toString(thirdArray));
        System.out.println("Fourth array = " + Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Sohib", "Saparvoy", "O'ktam", "Xurram", "Jumaboy"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        if (Arrays.binarySearch(sArray, "Xurram") >= 0) {
            System.out.println("Found Xurram in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {5, 2, 3, 4, 1};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    private static int [] getRandomArray(int len) {

        Random random = new Random();
        int [] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
