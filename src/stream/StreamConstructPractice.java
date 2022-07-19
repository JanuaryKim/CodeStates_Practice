package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamConstructPractice {
    public static void main(String[] args) {

        //리스트에서의 스트림 생성
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bddf");
        list.add("dfdf");
        list.add("vdv");

        Stream<String> stream = list.stream(); //스트림 생성

        List<Integer> list2 = Arrays.asList(new Integer[] {1,2,3,4,6,11});

        Stream<Integer> stream2 = list2.stream(); //스트림 생성

        //~ 리스트에서의 스트림 생성

        // 배열에서의 스트림 생성

        Stream<String> stream3 = Stream.of(new String[]{"봄","여름", "가을", "겨울"}); //스트림 생성
        Stream<String> stream4 = Stream.of("1월","2월","3월"); //스트림 생성
        Stream<String> stream5 = Arrays.stream(new String[] {"a", "b", "c"}, 0, 2); //end 범위 미포함, 0~1인덱스까지
        stream5.forEach(System.out::println);

        // ~배열에서의 스트림 생성

        //IntStream의 정적메소드를 이용한 스트림 생성
        IntStream stream6 = IntStream.range(0, 10);
        stream6.forEach(System.out::println);

        //~IntStream의 정적메소드를 이용한 스트림 생성


        Stream<String> stream7 = Arrays.stream(new String[] {"asdfsa", "vbjkvbjk","erwrer"});

        System.out.println("스트림 요소 모두 대문자로 변환 출력");
        stream7.map(s->s.toUpperCase()).forEach(s-> System.out.print(s + " "));
        System.out.println();


        System.out.println();
        // flatMap과 map의 차이
        System.out.println("flatMap으로 출력");
        Stream<String[]> stringArraysStream = Stream.of(
                new String[]{"hello", "world", "java"},
                new String[]{"code", "states"});

        stringArraysStream.flatMap(Arrays::stream).forEach(System.out::println);

        System.out.println();
        System.out.println("map으로 출력");
        Stream<String[]> stringArraysStream2 = Stream.of(
                new String[]{"hello", "world", "java"},
                new String[]{"code", "states"});

        stringArraysStream2.map(Arrays::stream).forEach(System.out::println);



    }
}
