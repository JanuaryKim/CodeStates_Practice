package stream.streamQuestion;

import java.util.Arrays;

public class C12 {
    public static void main(String[] args) {
        /** 이번주의 최고 온도만을 모아놓은 List를 분석하여 이번주가 더웠는지 알아봅시다. 최고 기온이 30도를 넘은 날이 3일 이상이면 true를, 그렇지 않다면 false를 리턴해야 합니다. **/
        int[] temperature = {25, 29, 30, 31, 26, 30, 33};

        long count = Arrays.stream(temperature).filter(t-> t >= 30).count();

        boolean result;
        if(count >= 3) result = true;
        else result = false;
    }
}
