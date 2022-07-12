public class ExtendsPractice {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "김코딩";
        p.age = 24;
        p.learn();
        p.eat();
        p.walk();
        System.out.println(p.name);

        Programmer programmer = new Programmer();
        programmer.name = "박해커";
        programmer.age = 26;
        programmer.learn();
        programmer.coding();
        System.out.println(programmer.name);
    }
}


class Person{
    String name;
    int age;

    void learn() {
        System.out.println("배웁니다");
    }

    void walk() {
        System.out.println("걷습니다");
    }

    void eat() {
        System.out.println("먹습니다");
    }
}

class Programmer extends Person {
    String companyName;

    void coding() {
        System.out.println("코딩을 합니다");
    }

}

class Dancer extends Person {
    String groupName;

    void dance() {
        System.out.println("춤을 춥니다");
    }

}

class Singer extends Person {
    String bandName;

    void singing() {
        System.out.println("노래를 합니다");
    }

    void playGuitar() {
        System.out.println("기타를 칩니다");
    }
}