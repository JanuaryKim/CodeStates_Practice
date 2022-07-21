package threa;

import org.w3c.dom.ls.LSOutput;

public class ThreadConstructPractice {
    public static void main(String[] args) {

        //Runnable 인터페이스를 사용한 Thread 생성과 사용
        ThreadClass1 threadClass1 = new ThreadClass1();
        Thread thread = new Thread(threadClass1);
        thread.start();


        for (int i = 0; i < 50; i++) {
            System.out.print("M");
        }

        System.out.println();
    }
}

class ThreadClass1 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 50; i++)
        {
            System.out.print("T");
        }

        System.out.println("현재 작업중인 쓰레드 이름 : " + Thread.currentThread().getName());
    }

}
