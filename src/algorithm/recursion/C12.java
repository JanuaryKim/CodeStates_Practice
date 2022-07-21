package algorithm.recursion;

import java.util.stream.IntStream;

public class C12 {
    public int[] reverseArr(int[] arr){
        // TODO:

        if(arr.length == 0 || arr.length == 1) return arr;

        int[] mainArr = new int[1];
        int[] subArr = new int[arr.length - 1];

        System.arraycopy(arr, arr.length-1, mainArr, 0, 1);
        System.arraycopy(arr, 0, subArr, 0, arr.length-1);

        return IntStream.concat(IntStream.of(mainArr), IntStream.of(reverseArr(subArr))).toArray();

    }
}
