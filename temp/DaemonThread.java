public class DaemonThread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            // Checking for daemon thread
            System.out.println("daemon thread work");
        } else {
            System.out.println("user thread work");
        }
    }

    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread(); // creating thread
        DaemonThread t2 = new DaemonThread();
        DaemonThread t3 = new DaemonThread();

        t1.setDaemon(true); // now t1 is daemon thread

        // starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
