
public class currentthread {
    static class MyThread extends Thread{
        public void run(){
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());

        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
