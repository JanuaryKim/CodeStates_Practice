package algorithm.recursion;

public class C10 {
    public boolean and(boolean[] arr){
        // TODO:

        if(arr.length == 1) return arr[0];
        else if(arr.length == 0) return true;

        boolean[] boolArr = new boolean[arr.length-1];
        System.arraycopy(arr, 1, boolArr, 0, arr.length-1);
        return arr[0] && and(boolArr);
    }
}
