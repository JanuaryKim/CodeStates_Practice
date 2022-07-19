package stream.streamQuestion;

import java.util.Arrays;
import java.util.List;

public class C07 {
    public static void main(String[] args) {

        /** String타입을 요소로 가지는 List를 입력받아 중복을 제거하고 김씨 성을 가진 이름들을 정렬하여 문자열 배열로 리턴해야 합니다. **/
        List<String> names = Arrays.asList("김코딩", "박해커", "김코딩", "최자바", "김자바");

        String[] kims = names.stream().distinct().filter(name -> name.startsWith("김")).sorted().toArray(s -> new String[s]);
//        String[] kims2 = names.stream().distinct().filter(name -> name.startsWith("김")).sorted().toArray(String[]::new); //위와 동일

    }
}
