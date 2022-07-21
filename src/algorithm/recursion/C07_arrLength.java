package algorithm.recursion;

import java.util.Arrays;
import java.util.stream.IntStream;

public class C07_arrLength {

    static int a= 0;
    public static void main(String[] args) {
        int[] result = reverseArr(new int[]{1,2,3,4});

        System.out.println();

    }

    public static int[] reverseArr(int[] arr){
        // TODO:

        if(arr.length == 0 || arr.length == 1) return arr;

        int[] mainArr = new int[1];
        int[] subArr = new int[arr.length - 1];

        System.arraycopy(arr, arr.length-1, mainArr, 0, 1);
        System.arraycopy(arr, 0, subArr, 0, arr.length-1);

        return IntStream.concat(IntStream.of(mainArr), IntStream.of(reverseArr(subArr))).toArray();
    }
}
