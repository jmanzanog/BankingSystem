package banking;

/**
 * Abstract bank account class.<br>
 * <br>
 * <p>
 * Private Variables:<br>
 * : AccountHolder<br>
 * : Long<br>
 * {@link #pin}: int<br>
 * {@link #balance}: double
 */
public abstract class Account {
    private final int pin;
    private double balance;

    protected Account(int pin, double startingDeposit) {
        this.pin = pin;
        this.balance = startingDeposit;
    }

    public boolean validatePin(int attemptedPin) {
        return this.pin == attemptedPin;
    }

    public synchronized double getBalance() {
        return this.balance;
    }

    public synchronized void  creditAccount(double amount) {
        this.balance = this.balance + amount;
    }

    public synchronized boolean debitAccount(double amount) {
        if (this.balance >= amount){
            this.balance = this.balance - amount;
            return true;
        }
        return false;
    }
}
