package lamda;

public class LamdaPractice {
    public static void main(String[] args) {

        LamdaInterface1 lamInter1 = (int num1, int num2) -> System.out.println("num1 + num2 = " +num1 + num2);
        lamInter1.sum(3,5);

        LamdaInterface1 lamInter2 = (num1, num2) -> System.out.println("num1 + num2 = " +num1 + num2); // 매개변수 타입 생략
        lamInter2.sum(3,5);

        Runnable runnable = () -> System.out.println("Runnable 인터페이스에 정의된 람다식!");

        runnable.run();
    }
}


@FunctionalInterface
interface LamdaInterface1{

    void sum(int value1, int value2);


    default void defaulMethod(){
        System.out.println("디폴트 메소드입니다");
    }
}
