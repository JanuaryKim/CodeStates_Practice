package stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student{

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class StreamPractice {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(new Student("제뉴어리맨", 32),   //Student를 요소로 가지는 리스트 생성
                new Student("줄라이맨", 34), new Student("어거스트맨",28),
                new Student("마치맨",27));

        Stream<Student> stream = studentList.stream(); //studentList의 Stream을 생성

        stream    //스트림 처리 시작 부분
                .filter(s -> s.getAge() >= 30) //중간 연산자, Stream의 각 요소(s)의 getAge를 호출해서 30 이상의 값들만 걸러서 챙김
                .forEach(s -> {   //최종 연사자, 중간연산자로 연산된 내용 각각을 처리
            String name = s.getName();
            int age = s.getAge();
            System.out.printf("%s 학생의 나이는 %d 입니다", name, age);
            System.out.println();
        });   //~ 스트림 처리 종료 부분
    }
}
