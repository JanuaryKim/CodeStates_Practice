import java.util.ArrayList;
import java.util.HashMap;

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


        
        String[] arr = new String[]{"ddd", "dddxx"};
        HashMap<String,String> result = new HashMap<>();
        result.put(arr[0], arr[arr.length-1]);
        Object ob =  arr.length == 0 || arr == null ? null : result;

        System.out.println("ddd");
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






