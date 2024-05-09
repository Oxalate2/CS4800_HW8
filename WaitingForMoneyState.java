public class WaitingForMoneyState extends StateOfVendingMachine {
    private SnackDispenseHandler snackDispenseHandler;
    public WaitingForMoneyState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }
    @Override
    public void selectSnack(Snack snack) {
        System.out.println("Snack already selected, please insert money.");
    }

    @Override
    public void insertMoney(Snack snack, double money) {
        if(money >= snack.getPrice()) {
            vendingMachine.setState(new DispensingSnackState(vendingMachine));
            System.out.println("Thank you for your purchase!");
        } else {
            System.out.println("Insufficient funds, returning money.");
        }
    }
    @Override
    public boolean dispenseSnack(Snack snack) {
        System.out.println("Unable to dispense snack, please insert money first.");
        return false;
    }
}
