package stream.streamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C13 {
    public static void main(String[] args) {

        /** 남성 회원 이름의 List와 여성 회원 이름의 List가 있습니다. 남성 회원과 여성 회원 중
         * 특정 성씨를 갖고 있는 사람의 명단이 필요합니다. 중복된 이름은 제거하고 특정 성씨를 갖고 있는 회원들의
         * 이름을 정렬한 후 List로 리턴해야 합니다. **/

        List<String> male = Arrays.asList("김코딩", "최자바", "김코츠");
        List<String> female = Arrays.asList("박해커", "김유클", "김코딩");
        String lastName = "김";
//        List<String> male = Arrays.asList("");
//        List<String> female = Arrays.asList("");

        List<String> result = Stream.concat(male.stream(), female.stream()).distinct().filter(s-> s.startsWith(lastName))
                .sorted().collect(Collectors.toList());

        System.out.println(result);
    }
}
