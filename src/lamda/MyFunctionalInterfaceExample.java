package lamda;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) throws Exception {


        /** 매개변수 없는 람다식 연습 **/
        MyFunctionalInterface lamda1 = () -> { // 매개변수 없고 리턴 없음

            System.out.println("myFunctionalInterface.accept()!");
        };

        lamda1.accept(); // 메소드 호출

        MyFunctionalInterface lamda2 = () ->  // 매개변수 없고 리턴 없음
                System.out.println("myFunctionalInterface2.accept()! 한줄짜리"); // 한줄 body는 중괄호 생략

        lamda2.accept(); // 메소드 호출

        /** ~매개변수 없는 람다식 연습 **/



        /** 매개변수 하나 있는 람다식 연습 **/

        MyFunctionalInterface2 lamda3 = (x) -> { //매개변수 하나 있음
            int result = x * 5;
            System.out.println(result);
        };

        lamda3.calc(15);


        MyFunctionalInterface2 lamda4 = x -> System.out.println(x * 20); // 매개변수 하나 있는건 () 생략 가능, body 한줄도 {} 생략 가능

        lamda4.calc(2);

        /** ~매개변수 하나 있는 람다식 연습 **/





        /** 매개변수 두개 있고 리턴타입 있는 람다식 연습 **/
        MyFunctionalInterface3 lamda5 = (x, y) -> x * y; // return 문 쓰려면 {} 있어야함

        System.out.println("lamda5.calc(2, 90) = " + lamda5.calc(2, 90));

        MyFunctionalInterface3 lamda6 = (x, y) -> {
            return sum(x, y);
        };

        System.out.println("lamda6.calc(20,7) = " + lamda6.calc(20,7));
        /** ~매개변수 두개 있고 리턴타입 있는 람다식 연습 **/


        /** 메소드 레퍼런스 람다식 연습 **/
        MyFunctionalInterface3 lamda7 =
                MyFunctionalInterfaceExample :: complicatedSum;
        //body 부분이 단순히 다른 메소드에 값을 넘길때,
        // 추상메소드의 반환타입, 매개변수와 넘겨받는 메소드의 반환타입, 매개변수가 같아야함.

        lamda7.calc(2, 80);

        /** ~메소드 레퍼런스 람다식 연습 **/
    }

    public static int sum(int a, int b) {

        return a + b;
    }

    public static int complicatedSum(int a, int b) {
        int c = a * b ;
        int randomInt = (int)(Math.random() * c);
        return randomInt;
    }
}

@FunctionalInterface
interface MyFunctionalInterface {

    public void accept();
}

@FunctionalInterface
interface MyFunctionalInterface2 {

    public void calc(int a);
}

@FunctionalInterface
interface MyFunctionalInterface3 {
    public int calc(int x, int y);
}