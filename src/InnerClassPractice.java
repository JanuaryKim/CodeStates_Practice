public class InnerClassPractice {
    public static void main(String[] args) {

        Outer outer = new Outer(); // #1

        Outer.InClass inClass = new Outer().new InClass("SeperatedInClass");

        System.out.println("Outer 클래스의 객체를 만들어서 자동으로 만들어진 내부 클래스 이름 : "+outer.inClass.name);
        System.out.println("자체적으로 만들어진 내부 클래스 이름 : "+inClass.name);

        outer.method();

        Outer anonymousClass = new Outer(){ //익명 내부 클래스 선언, Outer 클래스를 상속받아서 정의

            @Override    //Outer 클래스의 메소드를 재정의하여 사용 가능
            public void method() {
//                super.method(); //상속받은 클래스의 메소드를 굳이 사용하진 않아도 된다.
            }
        };
    }
}

class Outer{

    private int num = 1; // #3
    private int sNum = 2; // #4

    public InClass inClass = new InClass("ParameterConstructor");  // #5
    //new 키워드와 생성자를
    // 이용하여 Outer 객체를 생성할때 Outer 생성자에서는 생성자의 시그니쳐 부분까지만 진입을 했다가 멤버 변수부분 부터 순차적으로 아래로 코드가 진행 되므로 InClass의 name 변수가 여기서 초기화 됬다가
    // 멤버 변수 부분을 모두 진행하고선 생성자의 시그니쳐 부분에서 멈춰져 있던 Outer의 생성자 부분에서부터 Outer의 생성자가 작동하여 초기화 되므로
    // 값을 덮어버림.


    public Outer(){ // #2
        inClass = new InClass(); // # 6

        System.out.println("Outer 생성자");
    }

    class InClass{

        String name = "멤버 영역 초기화"; // #7
        public InClass() {
            this.name = "BasicConstructor";
        }

        public InClass(String _name) { //6
            this.name = _name; // #8
        }
    }

    public void method(){
        int num2 = 15;

        class LocalInnerClass{
            int num = 5;

            public void print(){
                System.out.println();
                System.out.println("===== Outer클래스의 method 메서드 =====");
                System.out.println("num2 = " + num2);
                System.out.println("num = " + num);
                System.out.println("===== Outer클래스의 method 메서드 =====");
                System.out.println();
            }

        }

        LocalInnerClass localInnerClass = new LocalInnerClass();

        localInnerClass.print();
    }



}