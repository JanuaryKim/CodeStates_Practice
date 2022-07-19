package threa;

public class ThreadExample5 {
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            public void run() {
                try {
                    while (true) Thread.sleep(1000000);
                }
                catch (Exception e) {}
                System.out.println("Woke Up!!!");
            }
        };

        System.out.println("thread1.getState()1 = " + thread1.getState());

        thread1.start();

        System.out.println("thread1.getState()2 = " + thread1.getState());

        while (true) {
            System.out.println("thread1.getState()2.5 = " + thread1.getState());
            if (thread1.getState() == Thread.State.TIMED_WAITING) {
                System.out.println("thread1.getState()3 = " + thread1.getState());
                break;
            }
            System.out.println("반복");
        }

        thread1.interrupt();

        while (true) {
            if (thread1.getState() == Thread.State.RUNNABLE) {
                System.out.println("thread1.getState()4 = " + thread1.getState());
                break;
            }
        }

        while (true) {
            if (thread1.getState() == Thread.State.TERMINATED) {
                System.out.println("thread1.getState()5 = " + thread1.getState());
                break;
            }
        }
    }
}
