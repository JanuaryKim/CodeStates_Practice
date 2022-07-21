package lamda;

public class LamdaPractice2 {
    public static void main(String[] args) {

        FunctionInterface functionInterface = (a, b) -> {
            int sum = 0;
            for (int i = a; i < b; i++) {
                sum += i;
            }
            return sum;
        };

        System.out.println("functionInterface.reduce = "+ functionInterface.reduce(1, 11));

        FunctionInterface functionInterface1 = (left, right) -> Math.max(left,right); //기본적인 람다식

        System.out.println("functionInterface1.reduce(100,102) = " + functionInterface1.reduce(100,102));

        FunctionInterface functionInterface2 = Math::max; //기본적인 람다식을 메소드 레퍼런스형식으로 바꾼 코드

        System.out.println("functionInterface1.reduce(100,102) = " + functionInterface2.reduce(100,102));
    }
}

interface FunctionInterface{
    int reduce(int a, int b);
}