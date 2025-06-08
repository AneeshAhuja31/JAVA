class MultiPriority extends Thread {
    public void run() {
        System.out.println("Running thread name is: " + Thread.currentThread().getName());
        System.out.println("Running thread priority is: " + Thread.currentThread().getPriority());
    }

    public static void main(String args[]) {
        MultiPriority m1 = new MultiPriority();
        MultiPriority m2 = new MultiPriority();

        m1.setPriority(Thread.MIN_PRIORITY); // priority 1
        m2.setPriority(Thread.MAX_PRIORITY); // priority 10
        m1.start();
        m2.start();

    }
}
