public class CheckingAccount {
    private int accountId;
    private float balance;
    private static final float INSUFFICIENT_FUND_FEE = 25.0f;

    public CheckingAccount(int accountId, float balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public CheckingAccount(int accountId) {
        this(accountId, 0.0f);
    }

    public float getBalance() {
        return this.balance;
    }

    public int getId() {
        return this.accountId;
    }

    public void addInsufficientFundFee() {
        this.balance -= INSUFFICIENT_FUND_FEE;
        System.out.printf("Insufficient funds fee of $%.2f charged. New balance: $%.2f%n",
                INSUFFICIENT_FUND_FEE, this.balance);
    }

    public void noteReturnedCheck(Check theCheck) {
        System.out.println("Noted returned check #" + theCheck.getCheckNo() + " on account #" + this.accountId);
    }

    public void addDebitTransaction(int checkNumber, float amount) {
        this.balance -= amount;
        System.out.printf("Debited $%.2f for check #%d. Remaining balance: $%.2f%n",
                amount, checkNumber, this.balance);
    }

    public void storePhotoOfCheck(Check theCheck) {
        System.out.println("Stored digital image of check #" + theCheck.getCheckNo() + " in account records.");
    }
}