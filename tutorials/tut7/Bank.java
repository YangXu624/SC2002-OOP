public class Bank {

    public float cashCheck(Check theCheck) {
        float amount = theCheck.getAmount();
        CheckingAccount account = theCheck.getAccount();
        float balance = account.getBalance();

        // Optional fragment: [balance < amount]
        if (balance < amount) {
            account.addInsufficientFundFee();
            account.noteReturnedCheck(theCheck);
            returnCheck(theCheck);
            return -1;
        }

        // Normal flow: [balance >= amount]
        int checkNumber = theCheck.getCheckNo();
        account.addDebitTransaction(checkNumber, amount);
        account.storePhotoOfCheck(theCheck);
        return amount;
    }

    public void returnCheck(Check theCheck) {
        System.out.println("Bank: Returning check #" + theCheck.getCheckNo() + " to presenter.");
    }
}