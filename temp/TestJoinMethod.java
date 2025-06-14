class TestJoinMethod extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        TestJoinMethod t1 = new TestJoinMethod();
        TestJoinMethod t2 = new TestJoinMethod();
        TestJoinMethod t3 = new TestJoinMethod();

        t1.start();
        try {
            t1.join();  // Wait for t1 to finish before starting t2 and t3
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}
