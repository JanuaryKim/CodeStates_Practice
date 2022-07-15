import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        //데이터 추가
        arrayList.add("제뉴어리맨");
        arrayList.add("김아무개");
        arrayList.add("김가놈");
        arrayList.add("김씨");
        arrayList.add("김");

        System.out.println("arrayList.size() : " + arrayList.size());
        //데이터 수정
        arrayList.set(1, "김갑돌");

        //데이터 조회
        System.out.println("arrayList.get(1) : " + arrayList.get(1));

        //데이터 삭제
        System.out.println(arrayList.toString());
        arrayList.remove("김씨");
        System.out.println(arrayList.toString());
        arrayList.remove(arrayList.size()-1);

        //리스트 초기화
        arrayList.clear();
        System.out.println(arrayList.toString());
    }
}
