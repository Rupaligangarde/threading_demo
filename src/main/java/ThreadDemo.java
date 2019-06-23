public class ThreadDemo{
    public static void main(String[] args) {

        Runnable worker1 = ()->{
            for (int i = 0; i < 10; i++)
                System.out.println("inside method1");
        };

        Runnable worker2 = ()->{
            for (int i = 0; i < 10; i++)
                System.out.println("inside method2");
        };

        Thread thread1 = new Thread(worker1);
        Thread thread2 = new Thread(worker2);
        thread1.start();
        thread2.start();
    }
}
