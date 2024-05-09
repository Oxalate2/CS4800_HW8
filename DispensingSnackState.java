public class DispensingSnackState extends StateOfVendingMachine {
    private final SnackDispenseHandler snackDispenseHandler;
    public DispensingSnackState(VendingMachine vendingMachine) {
        super(vendingMachine);
        snackDispenseHandler = new SnackDispenseHandler() {
            @Override
            public boolean handle(Snack snack) {
                return true;
            }
        };
    }

    @Override
    public void selectSnack(Snack snack) {
        System.out.println("No need to select snack in Dispensing State.");
    }

    @Override
    public void insertMoney(Snack snack, double money) {
        System.out.println("Cannot deposit money in Dispensing State.");
    }
    @Override
    public boolean dispenseSnack(Snack snack) {
        if (snackDispenseHandler.handle(snack)) {
            vendingMachine.setState(new IdleState(vendingMachine));
            snack.removeQuantity(1);
            return true;
        }
        return false;
    }
}
