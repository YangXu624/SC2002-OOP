public class CheckingAccount {
    private int accountId;
    private float balance;

    public CheckingAccount(int accountId, float balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public CheckingAccount(int accountId) {
        this.accountId = accountId;
        this.balance = 0;
    }

    public getBalance() {
        return this.balance;
    }

    public getId() {
        return this.accountId;
    }

    public void addInsufficientFundFee() {
        System.out.println("Fee added lol");
    }

    public void noteReturnedCheck(Check theCheck) {
        System.out.println("Note returned check");
    }
}