import java.util.ArrayList;
import java.util.List;

class Army{
    String attack(){
        return "공격!!";
    }
}
class SpecialArmy extends Army{ //Army를 상속(확장) 함.
    String name;

    public SpecialArmy(String name) {
        this.name = name;
    }
}

class Bunker{
    public static <T extends Army> void totalAttack(List<T> armyList){ //제네릭 메소드, static에 가능

        for (Army a : armyList) {
            SpecialArmy sa = (SpecialArmy) a; //totalAttack 클래스의 객체는 main에서 SpecialArmy로 지정을 했기에 SpecialArmy보다 상위 클래스 객체는 들어올 수 없음.
            System.out.println(sa.name + sa.attack()); //extends Army로 최소한 Army이거나 Army의 하위 클래스가 들어올것을 유추할 수 있으므로
            //Army의 멤버 메소드 사용 가능!!
        }
    }
}

public class GenericPractice3 {
    public static void main(String[] args) {

        List<SpecialArmy> specialArmies = new ArrayList<>();
        specialArmies.add(new SpecialArmy("제뉴어리맨")); //제네릭의 제한이 <T extends Army> 이므로 SpecialArmy 가능.
        specialArmies.add(new SpecialArmy("줄라이맨"));
        specialArmies.add(new SpecialArmy("준맨"));

        Bunker.totalAttack(specialArmies);
    }
}
