public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // 1. Test case: Insufficient Funds (balance < amount)
        System.out.println("========== Test Case 1: Insufficient Funds ==========");
        CheckingAccount acc1 = new CheckingAccount(1001, 100.0f);
        Check badCheck = new Check(250.0f, acc1, 501);

        float result1 = bank.cashCheck(badCheck);
        System.out.println("Returned to client: " + result1);
        System.out.println();

        // 2. Test case: Sufficient Funds (balance >= amount)
        System.out.println("========== Test Case 2: Sufficient Funds ==========");
        CheckingAccount acc2 = new CheckingAccount(1002, 500.0f);
        Check goodCheck = new Check(150.0f, acc2, 502);

        float result2 = bank.cashCheck(goodCheck);
        System.out.println("Returned to client: $" + result2);
    }
}
