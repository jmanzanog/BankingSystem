package banking;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
    private Map<Long, Account> accounts;
    private Random random;

    public Bank() {
        this.random = new Random();
        this.accounts = new ConcurrentHashMap<>();
    }

    private Account getAccount(Long accountNumber) {
        return this.accounts.get(accountNumber);
    }

    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
        Long id = random.nextLong();
        this.accounts.put(id, new CommercialAccount(company, id, pin, startingDeposit));
        return id;
    }

    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
        Long id = random.nextLong();
        this.accounts.put(id, new ConsumerAccount(person, id, pin, startingDeposit));
        return id;
    }

    public boolean authenticateUser(Long accountNumber, int pin) {

        return this.accounts.get(accountNumber).validatePin(pin);
    }

    public double getBalance(Long accountNumber) {
        // complete the function
        return this.accounts.get(accountNumber).getBalance();
    }

    public void credit(Long accountNumber, double amount) {
        // complete the function
        this.accounts.get(accountNumber).creditAccount(amount);
    }

    public boolean debit(Long accountNumber, double amount) {
        return this.accounts.get(accountNumber).debitAccount(amount) ;
    }
}
