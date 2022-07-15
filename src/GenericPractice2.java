import java.util.ArrayList;
import java.util.List;

interface Unit{
    void Attack();
    void defense();
}

class Marine implements Unit{

    @Override
    public void Attack() {
        System.out.println("마린이 공격을 합니다.");
    }

    @Override
    public void defense() {
        System.out.println("마린이 방어를 합니다.");
    }
}
class SuperMarine extends Marine{
}

class Academy<T extends Marine & Unit> {
    List<T> list = new ArrayList<>();

    void add (T unit) { list.add(unit);}
    T add (int index) { return list.get(index);}

}

public class GenericPractice2 {
    public static void main(String[] args) {
        Academy<SuperMarine> academy = new Academy();
//        academy.add(new Marine()); // 에러, 제네릭 선언을 <T extends Marine & Unit> 으로 했어도 객체생성시 SuperMarine이라고 지정했기에 안됨.
//        SuperMarine 참조변수의 기능의 수가 Marine보다 많기에 불가능. (다형성의 규칙)
        academy.add(new SuperMarine());

        Academy<Marine> academy2 = new Academy();
        academy2.add(new SuperMarine()); //다형성으로 인해 허용
    }
}

