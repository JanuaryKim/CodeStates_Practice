import java.util.ArrayList;

public class delete {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(9);
        arrayList.add(9);
        arrayList.add(9);
        arrayList.add(9);
        arrayList.add(9);
        arrayList.set(0,18);

        System.out.println("dd");
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






