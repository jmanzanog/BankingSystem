package banking;

public class Sequence {
    private static Sequence instance = null;
    private long currentValue = 0;

    private Sequence() {
        // constructor privado para prevenir instanciación externa
    }

    public static Sequence getInstance() {
        if (instance == null) {
            synchronized (Sequence.class) {
                if (instance == null) {
                    instance = new Sequence();
                }
            }
        }
        return instance;
    }

    public synchronized long getNextValue() {
        return ++currentValue;
    }
}
