public class MainApp {
    public static void main(String[] args) {
        // Vending machine and snack instantiation
        VendingMachine vendingMachine = new VendingMachine();
        Snack coke = new Snack("Coke", 2.50, 3);
        Snack pepsi = new Snack("Pepsi", 2.50, 2);
        Snack cheetos = new Snack("Cheetos", 3, 2);
        Snack doritos = new Snack("Doritos", 3, 1);
        Snack kitKat = new Snack("KitKat", 2.75, 4);
        Snack snickers = new Snack("Snickers", 2.75, 3);
        // Putting snacks into vending machine
        vendingMachine.addSnack(coke);
        vendingMachine.addSnack(pepsi);
        vendingMachine.addSnack(cheetos);
        vendingMachine.addSnack(doritos);
        vendingMachine.addSnack(kitKat);
        vendingMachine.addSnack(snickers);

        // Handler instantiation
        SnackDispenseHandler handler = new CokeHandler();
        handler.setNextHandler(new PepsiHandler())
                .setNextHandler(new CheetosHandler())
                .setNextHandler(new DoritosHandler())
                .setNextHandler(new KitKatHandler())
                .setNextHandler(new SnickersHandler());

        // Dispense snack
        vendingMachine.state.selectSnack(doritos);
        vendingMachine.state.insertMoney(doritos, 5);
        vendingMachine.state.dispenseSnack(doritos);

        vendingMachine.state.selectSnack(doritos);
        vendingMachine.state.insertMoney(doritos, 5);
        vendingMachine.state.dispenseSnack(doritos);

        vendingMachine.state.selectSnack(pepsi);
        vendingMachine.state.insertMoney(pepsi, 5);
        vendingMachine.state.dispenseSnack(pepsi);

        vendingMachine.state.selectSnack(snickers);
        vendingMachine.state.insertMoney(snickers, 1);
        vendingMachine.state.dispenseSnack(snickers);

        vendingMachine.state.selectSnack(cheetos);
        vendingMachine.state.insertMoney(cheetos, 1);
        vendingMachine.state.dispenseSnack(cheetos);

        vendingMachine.state.selectSnack(kitKat);
        vendingMachine.state.insertMoney(kitKat, 3);
        vendingMachine.state.dispenseSnack(kitKat);

        vendingMachine.state.selectSnack(coke);
        vendingMachine.state.insertMoney(coke, 2);
        vendingMachine.state.dispenseSnack(coke);
    }
}
