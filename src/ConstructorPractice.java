public class ConstructorPractice {
    public static void main(String[] args) {

        NotMakedConstructor notMakedConstructor = new NotMakedConstructor();
        notMakedConstructor.serial = 1111;
        notMakedConstructor.name = "무생성자클래스";

//        MakedConstructor makedConstructor = new MakedConstructor(); //에러 발생, 생성자를 만든 이상 만들어진 생성자를 써야함.
        MakedConstructor makedConstructor = new MakedConstructor(2222, "유생성자클래스");


        System.out.println("===========================");
        System.out.println(notMakedConstructor);
        System.out.println(makedConstructor);
        System.out.println("===========================");
    }
}


class NotMakedConstructor{
    int serial;
    String name="";

    public String toString(){
        String str = String.format("class의 종류는 %s 이고 serial은 %d 이며,name은 %s 입니다.",
                this.getClass().getName(), serial, name);
        return str;
    }


}


class MakedConstructor{
    int serial;
    String name="";

    MakedConstructor(){

    }

    MakedConstructor(int _serial, String _name) {
        this.serial = _serial;
        this.name = _name;
//        this(); //생성자가 생성자 body에서 첫번째 문단에 있지 않으므로 에러
    }

    public String toString(){
        String str = String.format("class의 종류는 %s 이고 serial은 %d 이며,name은 %s 입니다.",
                this.getClass().getName(), serial, name);
        return str;
    }

    public void method() {
//        this(); //에러, 일반 메서드에서 this(본 객체를 의미) 로 멤버변수(필드)를 참조 할 순 있지만, 생성자를 호출 할 순 없다.
    }
}
