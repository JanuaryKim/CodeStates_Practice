public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("안녕하세요").append("추가되는 메세지지입니다");
        String str = stringBuilder.toString();
        System.out.println(stringBuilder);
        System.out.println(str);


    }
}
