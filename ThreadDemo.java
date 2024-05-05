public class ThreadDemo {
    public static void main(String[] args) {
        Runnable thread1 = () -> {

            // This is the body of the Thread
            for (int i = 1; i <= 10; i++) {
                System.out.println("i : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(thread1);
        t1.setName("john");
        t1.start();

        Runnable thread2 = () -> {

            // Print the Table of 2

            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(2 * i);
                }
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread t2 = new Thread(thread2);
        t2.setName("table");
        t2.start();

    }

}
