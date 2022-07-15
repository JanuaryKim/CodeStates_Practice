import java.util.HashSet;
import java.util.TreeSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Floor");
        hashSet.add("Baseball");
        hashSet.add("Abastract");
        hashSet.add("Cat");
        hashSet.add("ask");
        hashSet.add("ask"); //중복 데이터

        System.out.println("HashSet : " + hashSet);

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Floor");
        treeSet.add("Baseball");
        treeSet.add("Abastract");
        treeSet.add("Cat");
        treeSet.add("ask");
        treeSet.add("ask"); //중복 데이터

        System.out.println("TreeSet : "+treeSet);
    }
}
