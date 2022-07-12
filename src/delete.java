import java.util.ArrayList;

public class delete {
    public static void main(String[] args) {
        GenericClass3.genericMethod(1);

    }
}


class GenericClass {

    public static <T> void genericMethod(T item){
        System.out.println(item.getClass().getName());

    }

}

//class GenericClass2 <T> {
//
//    public static void genericMethod(T item){   //에러
//        System.out.println(item.getClass().getName());
//
//    }
//
//}

class GenericClass3 {

    public static <T extends Integer> void genericMethod(T item){
        System.out.println((Integer)item + 5);

    }

}








//class Tree{
//
//
//}


//class MelonTree extends Tree {
//    public static void peekBox(Forest<Object> box) {
//    }
//
//
//}
//class AppleTree extends Tree{
//    public static <T> void peekBox(Forest<T> box) {
//    }
//}

//class Forest <T> {
//    ArrayList<T> list;
//
//
//    public Forest() {
//        this.list = new ArrayList<>();
//    }
//
//    void add (T tree) {
//
//        list.add(tree);
//    }
//
//    <M extends String> void genericMethod(M data) {
//
//        System.out.println(data.getClass().getName());
//
//    }
//}

