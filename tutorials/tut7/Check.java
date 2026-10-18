public class Check {
    private float amount;
    private CheckingAccount account; // Account the check is drawn against
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
        return this.account;
    }

    public int getCheckNo() {
        return this.checkNumber;
    }
}