package stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MiddleOperPractice {
    public static void main(String[] args) {

        List<String> strList = List.of("fdfd","adsd","vcvsfd");
        Stream<String> sorted = strList.stream().sorted(); //중간 연산
        String[] strings = sorted.toArray(String[]::new);  //최종 연산 없이 배열화

        for (String s : strings) {
            System.out.println(s); //결과 출력, 중간연산까지 수행된 내용이 출력
        }

    }
}
