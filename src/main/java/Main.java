public class Main {
    public static void main(String[] args) {

        Counter count = new Counter();
        count.setCount(0);
        Thread thread = new MyThread(count);
        MyRunnable runnable = new MyRunnable(count);
        Thread fromRunnable = new Thread(runnable);
        thread.start();
        fromRunnable.start();
    }
}
