public class setpriority {
    static class MyThread extends Thread{
        public void run(){
            System.out.println("running thread name is: "+Thread.currentThread().getName());
            System.out.println("running thread priority is: "+Thread.currentThread().getPriority());
        } 
    } 
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }  
}