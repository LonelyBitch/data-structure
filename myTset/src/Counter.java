import java.util.concurrent.atomic.AtomicInteger;

/**
 * 计数器实现
 */
public class Counter implements Runnable {


//    private static AtomicInteger integer = new AtomicInteger(0);

    private  static int cou= 0;
    public static void main(String[] args) {
        Counter mythread = new Counter();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(mythread);
            thread.start();
        }

    }

    @Override
    public void run() {
        count();
    }

    public static void count() {
        synchronized (Counter.class) {
//            integer.incrementAndGet();
            cou++;
            System.out.println(Thread.currentThread().getName() + "======" + cou);
        }
    }
}
