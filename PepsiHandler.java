public class PepsiHandler extends SnackDispenseHandler {
    @Override
    public boolean handle(Snack snack) {
        if (snack.getName().equalsIgnoreCase("Pepsi")) {
            System.out.print("Dispensing Pepsi.");
            return true;
        }
        return handleNext(snack);
    }
}
