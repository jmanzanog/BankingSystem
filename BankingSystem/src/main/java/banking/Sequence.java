package banking;

import java.util.concurrent.atomic.AtomicLong;

public class Sequence {
    private AtomicLong currentValue;

    private Sequence() {
        reset();
    }

    public  void reset() {
        this.currentValue = new AtomicLong();
    }


    private static final class InstanceHolder {
        static final Sequence instance = new Sequence();
    }

    public static Sequence getInstance() {
        return InstanceHolder.instance;
    }

    public  long getNextValue() {
        return currentValue.addAndGet(1);
    }
}
