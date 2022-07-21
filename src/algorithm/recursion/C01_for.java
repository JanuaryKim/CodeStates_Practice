package algorithm.recursion;

public class C01_for {
    public static void main(String[] args) {

        long startT = System.currentTimeMillis();
        plus(9000);

        Double sec = (System.currentTimeMillis() - startT) / 1000.0;
        System.out.println("반복문시 경과 시간 : " + sec);
    }


    public static int plus(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        return sum;
    }
}
