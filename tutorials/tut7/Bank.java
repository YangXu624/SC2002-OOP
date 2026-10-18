public class Bank {

    public static int cashCheck(Check theCheck) {
        float amt = theCheck.getAmount();
        int account = theCheck.getAccount();
        float bal = account.getBalance();

        if (bal < amt) {
            account.addInsufficientFundFee();
            account.noteReturnedCheck(theCheck);
            return -1
        }
        else {
            checkNumber = theCheck.getCheckNo();
        }
    }
}