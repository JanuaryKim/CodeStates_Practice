package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JustPractice {
    public static void main(String[] args) {

        System.out.println("1~10 합계 = " +Arrays.asList(1,2,7,3,8,5,9,6,8,10,4,16,16,1000,1000)
                .stream().distinct().filter(i -> i <= 10).mapToInt(i->i).sum());


        List<Member> list = new ArrayList<>();
        list.add(new Member(50,Member.MALE, "제뉴어리맨"));
        list.add(new Member(100,Member.FEMALE, "악토버맨"));
        list.add(new Member(150,Member.MALE, "준맨"));

        Stream<Member> maleFemaleStream = list.stream();
        Stream<Member> maleStream = maleFemaleStream.filter(m -> m.getGender() == Member.MALE);
//        IntStream ageStream = maleStream.mapToInt(Member::getAge); //아래와 동일 코드
        IntStream ageStream = maleStream.mapToInt(m -> m.getAge());  //위와 동일 코드
        OptionalDouble opd = ageStream.average();
        double ageAve = opd.getAsDouble();

        System.out.println(ageAve);
    }
}

class Member{

    public static int MALE = 1;
    public static int FEMALE = 0;

    String name;
    int age;
    int gender;

    public Member(int age, int gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }
}