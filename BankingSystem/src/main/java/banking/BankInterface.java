package banking;

/**
 * The public methods for the {@link Bank} class.
 */
public interface BankInterface {

    /**
     * Creates a new account and adds it to .
     *
     * @return The account number for the newly created account.
     */
    Long openCommercialAccount(Company company, int pin, double startingDeposit);

    /**
     * Creates a new account and adds it to .
     *
     * @return The account number for the newly created account.
     */
    Long openConsumerAccount(Person person, int pin, double startingDeposit);

    /**
     * @param accountNumber The account number for the transaction.
     * @return true if authentication was successful.
     */
    boolean authenticateUser(Long accountNumber, int pin);

    /**
     * @param accountNumber The account number for the transaction.
     * @return the balance of the account.
     */
    double getBalance(Long accountNumber);

    /**
     * @param accountNumber The account number for the transaction.
     * @param amount        The amount of money being deposited.
     */
    void credit(Long accountNumber, double amount);

    /**
     * @param accountNumber The account number for the transaction.
     * @return true if amount could be withdrawn; otherwise, return false.
     */
    boolean debit(Long accountNumber, double amount);
}
