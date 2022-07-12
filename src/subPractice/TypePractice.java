package subPractice;

public class TypePractice {
    public static void main(String[] args) {
        SuperClass superClass = new ChildClass();
        superClass.superValue = 11;

        ChildClass childClass = (ChildClass) superClass;
        childClass.superValue = 200;

        System.out.println(superClass.superValue);


        superClass.print();
        childClass.print();
    }
}

class SuperClass{

    int superValue = 1;
    void print(){
        System.out.println(this.getClass().getName());
    }
}

class ChildClass extends SuperClass {


    void print(){
        System.out.println(this.getClass().getName());
    }
}