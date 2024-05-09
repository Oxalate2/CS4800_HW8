public abstract class StateOfVendingMachine {
    protected VendingMachine vendingMachine;

    public StateOfVendingMachine(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public abstract void selectSnack(Snack snack);
    public abstract void insertMoney(Snack snack, double money);
    public abstract boolean dispenseSnack(Snack snack);
}
