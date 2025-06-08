public class implementRunnable {
    static class Multi implements Runnable {
        public void run() {
            System.out.println("thread is running");
        }
    }
    
    public static void main(String[] args) {
        Multi m = new Multi();
        Thread t = new Thread(m);
        t.start();
    }
}