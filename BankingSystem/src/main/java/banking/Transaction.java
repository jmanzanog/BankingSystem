package banking;

/**
 * Private Variables:<br>
 * {@link #accountNumber}: Long<br>
 * {@link #bank}: Bank<br>
 */
public class Transaction {
    private final Long accountNumber;
    private final Bank bank;

    /**
     * @param bank          The bank where the account is housed.
     * @param accountNumber The customer's account number.
     * @param attemptedPin  The PIN entered by the customer.
     * @throws Exception Account validation failed.
     */
    public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
        this.accountNumber = accountNumber;
        this.bank = bank;
        if (!this.bank.authenticateUser(accountNumber, attemptedPin)) {
            throw new Exception();
        }

    }

    public double getBalance() {
        return this.bank.getBalance(this.accountNumber);
    }

    public void credit(double amount) {
        this.bank.credit(this.accountNumber, amount);
    }

    public boolean debit(double amount) {
        // complete the function
        return this.bank.debit(this.accountNumber, amount);
    }
}
