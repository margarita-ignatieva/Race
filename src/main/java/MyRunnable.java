import org.apache.log4j.Logger;

public class MyRunnable implements Runnable {
    private static final Logger log = Logger.getLogger(MyRunnable.class);
    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCount() < 50) {
            counter.add();
            log.info("count from myrunnable is " + counter.getCount());
        }
    }
}
