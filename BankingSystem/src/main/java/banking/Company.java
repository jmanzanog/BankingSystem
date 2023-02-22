package banking;

public class Company extends AccountHolder{
    private String companyName;
    private int taxId;

    public Company(String companyName, int taxId) {
        super(taxId);
        this.companyName = companyName;
        this.taxId = taxId;
    }

    public int getTaxId() {
        return taxId;
    }

    public String getCompanyName() {
        return this.companyName;
    }
}
