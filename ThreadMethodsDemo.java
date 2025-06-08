public class ThreadMethodsDemo {
    public static void main(String[] args) {
        // Create a thread using an anonymous class
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                try {
                    Thread.sleep(500);
                    Thread.yield(); // Give other threads a chance
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted");
                }
            }
        });

        // Set thread name and priority
        t1.setName("WorkerThread");
        t1.setPriority(Thread.MAX_PRIORITY); // Max = 10

        // Get thread properties
        System.out.println("Thread Name: " + t1.getName());
        System.out.println("Thread Priority: " + t1.getPriority());
        System.out.println("Thread ID: " + t1.getId());
        System.out.println("Is Alive before start? " + t1.isAlive());

        // Start the thread
        t1.start();

        // Wait a moment and check if it's alive
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}

        System.out.println("Is Alive after start? " + t1.isAlive());

        // Change name and priority while running
        t1.setName("ModifiedWorker");
        t1.setPriority(Thread.MIN_PRIORITY); // Min = 1

        System.out.println("New Name: " + t1.getName());
        System.out.println("New Priority: " + t1.getPriority());

        // Wait for thread to finish
        try {
            t1.join();
        } catch (InterruptedException e) {}

        System.out.println("Is Alive after join? " + t1.isAlive());

        
    }
}
