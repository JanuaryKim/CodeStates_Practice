package stream.streamQuestion;

import java.util.Arrays;

public class C09 {
    public static void main(String[] args) {
        /** String 타입을 요소로 가지는 배열을 입력받아, 가장 길이가 긴 문자열 요소의 길이를 리턴해야 합니다. **/

        String[] strArr = {"codestates", "java", "backend", "programming"};

        int maxLength = Arrays.stream(strArr).map(s-> s.length()).mapToInt(length->length).max().getAsInt();
    }
}
