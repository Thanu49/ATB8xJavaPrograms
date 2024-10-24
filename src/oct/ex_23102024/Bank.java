package oct.ex_23102024;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankname) throws Exception{
        if (!bankname.currency.equalsIgnoreCase("inr")) {
            throw new Exception("currency not matching");
        }
            return bankname.amount + this.amount;

    }
}



