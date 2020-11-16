import org.apache.log4j.Logger;

public class MyThread extends Thread {
    private static final Logger log = Logger.getLogger(MyThread.class);
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getCount() < 50) {
            counter.add();
            log.info("count from mythread is " + counter.getCount());
        }
    }
}
