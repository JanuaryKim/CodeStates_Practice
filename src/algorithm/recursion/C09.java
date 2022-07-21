package algorithm.recursion;

import java.util.Arrays;

public class C09 {

    public static void main(String[] args) {
        int[] aa = take(5, new int[]{-1, -2, 1, 2, 3, 4, 5});
        System.out.println();
    }
    public static int[] take(int num, int[] arr){
        // TODO:

        // TODO:
//        if(num > arr.length) return arr;
//        else if(arr.length == 0) return arr;
//
//
//        int[] newArr = new int[arr.length-1];
//        System.arraycopy(arr, 0, newArr, 0, arr.length-1);
//
//        return newArr.length == num ? newArr : take(num, newArr);

        if(arr.length == num || num > arr.length) return arr;
        else if(arr.length == 0 || num == 0) return new int[0];



        return Arrays.copyOfRange(arr, 0, arr.length-1);
    }
}
