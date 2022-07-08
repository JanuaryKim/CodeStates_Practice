public class ClassPractice {
    public static void main(String[] args) {
        BasicClass basicClass = new BasicClass(); //일반 클래스 객체 생성

        BasicClass.InnerClass innerClass = basicClass.new InnerClass(); //내부 클래스 객체 생성
        BasicClass.InnerClass innerClass2 = new BasicClass().new InnerClass(); //내부 클래스 객체 생성

//        AbstractClass abstractClass = new AbstractClass(); // 에러, 추상 클래스는 그 클래스 자체를 생성자로 인스턴스화 할 수 없다.
        AbstractClass abstractClass2 = new AbstractClass() { // 정상작동. 생성과 동시에 추상 메서드를 재정의 하여 추상클래스 생성가능
            @Override
            public void abstractMethod() {

            }
        };

        AbstractClassChild abstractClassChild = new AbstractClassChild();
        abstractClassChild.abstractMethod();

//        BasicClass2.NestedClass.method(); //에러, 중첩 클래스의 경우 클래스의 객체화 없이 접근 가능하지만, static이 아닌 메서드는 호출 불가.
        BasicClass2.NestedClass.staticMethod(); //정상작동, 중첩 클래스에 접근하여 static 메서드는 호출 가능.

        BasicClass anonymousInstance = new BasicClass(){
            @Override
            public void method() {
                super.method();
            }
        };


        BasicClass2.NestedClass nestedClass1 = new BasicClass2.NestedClass();
        BasicClass2.NestedClass nestedClass2 = new BasicClass2.NestedClass();

        nestedClass1.data5 = 1;

        System.out.println(nestedClass1.data5);
        System.out.println(nestedClass2.data5);

    }
}
/** 클래스 정의 위치에 따른 구분 **/
class BasicClass{ //일반 클래스이면서 아우터 클래스

    String name = "JanuaryMan";

    public void method(){
        System.out.println("hello! i'm method in BasicClass.");
        System.out.println("name is " + name);
    }

    public class InnerClass{ //내부 클래스

    }

}


abstract class AbstractClass{ //추상 클래스
    public abstract void abstractMethod(); //추상 메서드
    public void basicMethod(){ //일반 메서드

    };
}

class AbstractClassChild extends AbstractClass{

    @Override
    public void abstractMethod() {
        System.out.println("i'm ChildClass of AbstractClass!");
    }
}


class BasicClass2{ //일반 클래스이면서 아우터 클래스

    int data1 = 20;
    static int data2 = 30;

    public void method(){

    }

    public static class NestedClass{ //중첩 클래스


//        int data3 = data1; // 에러발생. data1이 인스턴스 변수이기 때문에.
        int data4 = data2; //정상작동, data2는 static 변수이기 때문이다.
        int data5 = 11;
        public void method(){
            System.out.println("i'm method in NestedClass.");
            System.out.println("data4 = " + data4); //정상작동
        }

        public static void staticMethod(){
            System.out.println("i'm static method in NestedClass.");
//            System.out.println("data4 = " + data4); //에러, data4는 static 변수인 data2의 값을 가져왔지만, staticMethod가 static이기 때문이다
        }
    }

}

class BasicClass3{ //일반 클래스

    public void method(){
        class LocalClass{ //지역 클래스, 메서드 안에 정의됨

        }

        LocalClass localClass = new LocalClass();

    }
}

interface Box <T> { //인터페이스의 멤버변수는 항상 public static final 이고, 멤버 메소드는 항상 public abstract 이다. 키워드가 생략일 뿐이다.

    void put(T e); //인터페이스 내의 메소드는 public 밖에 안됨

    T get();
}

class BoxClass <T> implements Box{

    @Override
    public void put(Object e) {

    }

    @Override
    public Object get() {
        return null;
    }
}




