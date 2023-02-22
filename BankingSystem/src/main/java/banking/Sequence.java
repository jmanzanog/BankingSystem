package banking;

public class Sequence {
    private long currentValue = 0;

    private Sequence() {
        // constructor privado para prevenir instanciación externa
    }

    private static final class InstanceHolder {
        static final Sequence instance = new Sequence();
    }

    public static Sequence getInstance() {
        return InstanceHolder.instance;
    }

    public synchronized long getNextValue() {
        return ++currentValue;
    }
}
