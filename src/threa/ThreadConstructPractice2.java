package threa;

public class ThreadConstructPractice2 {
    public static void main(String[] args) {

        ThreadClass2 threadClass2 = new ThreadClass2();
        threadClass2.start();

        for(int i = 0; i < 50; i++)
        {
            System.out.print("M");
        }
    }
}


class ThreadClass2 extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 50; i++)
        {
            System.out.print("T");
        }
    }
}