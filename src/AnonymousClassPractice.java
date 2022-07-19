public class AnonymousClassPractice {
    public static void main(String[] args) {

        ParentInterface pi = new ParentInterface() {
            @Override
            public void print(int a) {
                System.out.println("상위 존재가 인터페이스인 익명클래스에서 " + a + " 를 print 합니다");
            }
        };
        pi.print(77);

        ParentClass pc = new ParentClass(){
            @Override
            void print(int a) {
                System.out.println("상위 존재가 클래스인 익명클래스에서 " + a + " 를 print 합니다");
            }
        };

        pc.print(100);
    }
}

interface ParentInterface{

    void print(int a);

}

class ParentClass{

    void print(int a){
        System.out.println(a + " 를 print 합니다");
    }

}