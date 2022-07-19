package stream.streamQuestion;

import java.util.Arrays;
import java.util.List;

public class C06 {
    public static void main(String[] args) {

        /** String 타입을 요소로 가지는 List를 입력받아 중복을 제거하고 정렬한 후 String 타입을 요소로 갖는 배열로 리턴해야 합니다 **/

        List<String> names = Arrays.asList("김코딩", "박해커", "김코딩", "최자바", "박해커");
        String[] result = names.stream().distinct().sorted().toArray(String[]::new);
        String[] result2 = names.stream().distinct().sorted().toArray(size -> new String[size]);
        System.out.println();
    }
}
