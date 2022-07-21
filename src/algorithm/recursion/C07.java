package algorithm.recursion;

public class C07 {

    public static void main(String[] args) {
        System.out.println(arrLength(new int[]{1, -2, 1, 3}));

    }

    public static int arrLength(int[] arr){
        // TODO:

        if(arr.length == 0) return 0;
        else if(arr.length == 1) return 1;


        int[] newArr = new int[arr.length-1];
        System.arraycopy(arr, 1, newArr, 0, arr.length-1);
        return 1 + arrLength(newArr);
    }
}
