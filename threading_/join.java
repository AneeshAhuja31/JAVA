public class join {
    static class MyThread extends Thread{
        public void run(){
            for(int i=1;i<=5;i++){
                try{
                    Thread.sleep(500);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                System.out.println(i);
            }
        }
        
    }
    public static void main(String[] args) throws InterruptedException{
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t1.join();
        t2.start();
        t3.start();
    }
}
