public class ThreadYieldDemo {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);

            // Yield the CPU
            Thread.yield();
        }
    }
}
