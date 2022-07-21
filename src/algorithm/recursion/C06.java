package algorithm.recursion;

public class C06 {

    public int arrProduct(int[] arr){
        // TODO:
        if(arr.length == 0) return 1;
        else if(arr.length == 1) return arr[0];


        int[] newArr = new int[arr.length-1];
        System.arraycopy(arr, 1, newArr, 0, arr.length-1);
        return arr[0] * arrProduct(newArr);
    }
}
