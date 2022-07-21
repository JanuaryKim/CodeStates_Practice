package algorithm.recursion;

public class C02 {


//    public boolean isOdd(int num) {
//        //TODO..
//
//        num = Math.abs(num);
//
//        if(num == 0) return false;
//        else if(num == 1) return true;
//
//        return isOdd(num - 2);
//    }

    //모범 답안
    public boolean isOdd(int num) {
        //TODO..

        if(num == 1)
        {
            return true;
        }
        if(num == 0)
        {
            return false;
        }
        if(num < 0) //음수 일 경우
        {
            return isOdd(-num);
        }

        return isOdd(num);
    }

}

