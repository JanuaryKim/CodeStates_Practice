package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeQuestion {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> collect = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()); //스트림을 리스트로 재반환

        long jjaksoo = list.stream().filter(i-> i % 2 == 0).count(); // 짝수 구하기
        System.out.println(jjaksoo);


        Member coding = new Member("coding", "Female", 25);
        Member hacker = new Member("hacker", "Male", 30);
        Member ingi = new Member("ingi", "Male", 32);
        List<Member> members = Arrays.asList(coding, hacker, ingi);


        if(!(members.stream().map(Member::getGender).anyMatch(gender -> gender.equals("Male"))) || members.size() == 0 )
        {
            System.out.println("남자 없음");
        }

        members.stream()
                .filter(m->m.getGender() == "Male").mapToDouble(m->m.getAge()).average().getAsDouble();
    }

    static class Member {
        String name;
        String gender;
        int age;

        public Member(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }
    }
}



