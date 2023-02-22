package banking;

/**
 * Account implementation for commercial (business) customers.<br><br>
 * <p>
 * Private Variables:<br>
 * : List&lt;Person&gt;<br>
 */
public class CommercialAccount extends Account{

    public CommercialAccount(int pin, double startingDeposit) {
        super(pin,startingDeposit);
    }

}
