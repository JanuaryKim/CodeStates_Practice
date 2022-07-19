package lamda;

import java.util.function.IntBinaryOperator;

public class MethodReferences {
    public static void main(String[] args) {

        /** 정적 메소드 참조 **/
        IntBinaryOperator operator;

        operator = Calculator :: staticMul; // operator의 하나뿐인 추상메소드와 staticMul 메소드는 반환타입, 매개변수가 같다

        System.out.println("정적 메소드 참조 : "+operator.applyAsInt(20,5)); //결국 operator에 재정의? 된 메소드 호출이기에,
        // IntBinaryOperator 의 메소드(applyAsInt)를 호출한다
        /** ~정적 메소드 참조 **/


        /** 인스턴스 메소드 참조 **/

        Calculator calculatorInstance = new Calculator();

        operator =  calculatorInstance :: instancePlu;

        System.out.println("인스턴스 메소드 참조 : "+operator.applyAsInt(20, 7));


        /** ~인스턴스 메소드 참조 **/




        /** 생성자 참조 **/

        LamdaInterface lamdaInterface = () -> {return new Calculator();}; //원래 기본 람다식

        Calculator calculator = lamdaInterface.makeCalculator();

        System.out.println("(기본 람다) calculator.instancePlu(5,6) = " + calculator.instancePlu(5,6));

        LamdaInterface constructorLamda = Calculator :: new;

        Calculator calculator1 = constructorLamda.makeCalculator();

        System.out.println("(생성자 참조) calculator.instancePlu(5,6) = "+calculator1.instancePlu(2,4));
        /** ~생성자 참조 **/
    }
}


interface LamdaInterface{
    public Calculator makeCalculator();
}
