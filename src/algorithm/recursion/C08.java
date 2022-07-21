package algorithm.recursion;

public class C08 {
    public int[] drop(int num, int[] arr){
        // TODO:

        if(arr.length == 0) return arr;
        else if(num == 0) return arr;
        else if(arr.length < num) num = arr.length;

        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 1, newArr, 0, arr.length-1);
        return drop(--num, newArr);
    }
}
