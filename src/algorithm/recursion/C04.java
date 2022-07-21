package algorithm.recursion;


//피보나치
public class C04 {
    public int fibonacci(int num){
        //TODO..
        if(num == 0) return 0;
        else if(num == 1) return 1;

        return fibonacci(num-2) + fibonacci(num-1);
    }
}
