import java.util.Arrays;

public class JustPractice {
    public static void main(String[] args) {

        int[] arr = new int[]{2};
        int[] result = Arrays.copyOfRange(arr, 1, arr.length); //배열에 실제 존재하는 인덱스보다 더 큰것을 하였는데도 에러 안나고 빈 배열 리턴
        System.out.println();

    }

}
