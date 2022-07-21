package algorithm.recursion;

public class C11 {
    public boolean or(boolean[] arr){
        // TODO:
        if(arr.length == 0) return false;
        else if(arr[0] == true) return true;

        boolean[] boolArr = new boolean[arr.length-1];
        System.arraycopy(arr, 1, boolArr, 0, arr.length-1);

        return arr[0] || or(boolArr);
    }
}
