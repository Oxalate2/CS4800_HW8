public class IdleState extends StateOfVendingMachine {
    private SnackDispenseHandler snackDispenseHandler;
    public IdleState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void selectSnack(Snack snack) {
        if(snack.getQuantity() <= 0) {
            System.out.println("No more " + snack.getName() + " in stock. Please choose another snack");
        } else {
            vendingMachine.setState(new WaitingForMoneyState(vendingMachine));
            System.out.println("You chose " + snack.getName() + ".\nPlease insert money.");
        }
    }
    @Override
    public void insertMoney(Snack snack, double money) {
        System.out.println("Cannot deposit money in Idle State.");
    }
    @Override
    public boolean dispenseSnack(Snack snack) {
        System.out.println("Unable to dispense snack in Idle State.");
        return false;
    }
}
