package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class Array {

    public static OptionalInt linearSearch(int[] array, int item) {
        return Arrays.stream(array).filter(element -> element == item).findFirst();
    }

    public static boolean binarySearch(int[] array, int item) {
        int min = 0, max = array.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if(item == array[mid]) {
                return true;
            } else if(item < array[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }

    public static int[] findEvenNumbers(int[] array1, int[] array2) {
        /*
        Option 1

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : array1) {
            if(num % 2 == 0) result.add(num);
        }
        for (int num : array2) {
            if(num % 2 == 0) result.add(num);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
         */

        // Option 2

        IntPredicate isEvenPredicate = num -> num % 2 == 0;
        return Stream.of(array1, array2).flatMapToInt(Arrays::stream).filter(isEvenPredicate).toArray();
    }

    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }

    public static void reverseInPlace(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            // Swap item at index (i) and item at index (array.length - i - 1)
            int temp = array[i];
            array[i] = array[array.length -i - 1];
            array[array.length -i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {-56, 10, 13, 54, 95, 16};
        Arrays.stream(findEvenNumbers(array1, array2)).forEach(System.out::println);
        System.out.println("-------------------------------------");
        Arrays.stream(reverse(array1)).forEach(System.out::println);
        System.out.println("-------------------------------------");
        reverseInPlace(array2);
        Arrays.stream(array2).forEach(System.out::println);
    }
}
