package stream.streamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C10 {
    public static void main(String[] args) {
        /** String 타입을 요소로 가지는 List 두 개를 입력받아, 스트림을 이용해 하나의 List로 합친 결과를 리턴해야 합니다. **/
        List<String> list1 = Arrays.asList("김코딩", "박해커");
        List<String> list2 = Arrays.asList("최자바", "이스프링");

        List<String> totalList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
    }
}
