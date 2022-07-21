package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> listStream = list.stream();
        listStream.forEach(i-> {
            System.out.println(i);
        });

        List<String> list2 = Arrays.asList("a", "b", "c");
        Stream<String> listStream2 = list2.stream();
        listStream2.forEach(System.out::println);


        // reduce 최종연산 테스트
        List<Integer> intList = List.of(1,2,3,4,5);

        int sum = intList.stream().reduce((a,b) -> a + b).get();

        System.out.println("reduce 결과 : "+sum);


        //초기값 없는 reduce
        List<Integer> intList2 = new ArrayList<>();

        int sum2 = intList2.stream().reduce(0,(a,b) -> a + b);

        System.out.println("reduce 결과 : "+sum2);
    }
}
