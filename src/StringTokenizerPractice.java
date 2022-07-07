import java.util.StringTokenizer;

public class StringTokenizerPractice {
    public static void main(String[] args) {

        String str = "안녕하세요.저는 제뉴어리맨입니다.반갑습니다";
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");

        System.out.println(stringTokenizer.countTokens());
        while(stringTokenizer.hasMoreTokens())
        {
            System.out.println(stringTokenizer.nextToken());
        }

        System.out.println(stringTokenizer.countTokens());
    }
}
