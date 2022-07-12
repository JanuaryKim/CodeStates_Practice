public class SuperPractice {
    public static void main(String[] args) {
        Child child = new Child();

    }
}

class Super{
    public Super(String str) {
        System.out.println(str);
    }
}

class Child extends Super{

    public Child() {
//        super(); //상위 클래스에 기본 생성말고 매개변수를 받는 생성자를 정의하였으므로 컴파일러가 기본 생성자를 추가해주지 않아서 에러발생.
        super("상위 클래스 초기화");
        System.out.println("하위 클래스 초기화");
    }
}