package stream.streamQuestion;

import java.util.Arrays;

public class C08 {
    public static void main(String[] args) {
        /** int 타입을 요소로 가지는 배열을 입력받아 가장 큰 요소를 리턴해야 합니다. **/

        int[] arr = {1, 10, 5, 32, 5};

        int a = Arrays.stream(arr).max().getAsInt();
    }
}
