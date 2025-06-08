class MyThread extends Thread {
    public void run() {
        // Code to be executed in the new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child thread: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();  // Create thread
        t1.start();                    // Start thread

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}
