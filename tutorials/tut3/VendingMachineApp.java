public class VendingMachineApp {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        double cost = vm.selectDrink();
        double amount = vm.insertCoins(cost);
        vm.checkChange(amount, cost);
        vm.printReceipt();
    }
}