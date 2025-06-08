class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child thread: " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {}
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        MyThread t1 = new MyThread();
        t.start();
        t.join(); 

        t1.start();

        // Wait for t to finish

        System.out.println("Main thread continues after child thread finishes");
    }
}
