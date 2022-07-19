package stream.streamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C11 {
    public static void main(String[] args) {

        /** Integer 타입을 요소로 가지는 List를 입력받아 각 요소에 2를 곱한 새로운 List를 리턴해야 합니다. **/
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = list.stream().map(i-> i * 2).collect(Collectors.toList());
    }
}
