package algorithm.recursion;

public class C01 {

    public static void main(String[] args) {
        long startT = System.currentTimeMillis();
        sumTo(9000);


        Double sec = (System.currentTimeMillis() - startT) / 1000.0;
        System.out.println("재귀시 경과 시간 : " + sec);
    }

    public static int sumTo(int num){
        //TODO..


        if(num == 1) return 1;
        else if(num == 0) return 0;


        return num + sumTo(--num);

    }
}
