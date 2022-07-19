package stream;

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
    }
}
