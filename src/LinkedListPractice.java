import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();

        //데이터 추가
        linkedList.add("제뉴어리맨");
        linkedList.add("김아무개");
        linkedList.add("김가놈");
        linkedList.add("김씨");
        linkedList.add("김");

        System.out.println("arrayList.size() : " + linkedList.size());
        //데이터 수정
        linkedList.set(1, "김갑돌");

        //데이터 조회
        System.out.println("arrayList.get(1) : " + linkedList.get(1));

        //데이터 삭제
        System.out.println(linkedList.toString());
        linkedList.remove("김씨");
        System.out.println(linkedList.toString());
        linkedList.remove(linkedList.size()-1);

        //리스트 초기화
        linkedList.clear();
        System.out.println(linkedList.toString());
    }
}
