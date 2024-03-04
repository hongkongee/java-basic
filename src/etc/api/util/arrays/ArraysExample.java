package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        char[] arr = {'J', 'A', 'V', 'A'};

        char[] arr2 = Arrays.copyOf(arr, 4);
        System.out.println(arr2);


    }
}
