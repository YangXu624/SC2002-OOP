public class Check {
    private float amount;
    private CheckingAccount account; // where the money comes from
    private int checkNumber;

    public Check(float amount, CheckingAccount account, int checkNumber) {
        this.amount = amount;
        this.account = account;
        this.checkNumber = checkNumber;
    }

    public float getAmount() {
        return this.amount;
    }

    public CheckingAccount getAccount() {
        return this.account; // return CheckingAccount object
    }

    public int getCheckNo() {
        return this.getCheckNo;
    }
}