public class KitKatHandler extends SnackDispenseHandler {
    @Override
    public boolean handle(Snack snack) {
        if (snack.getName().equalsIgnoreCase("KitKat")) {
            System.out.print("Dispensing KitKat.");
            return true;
        }
        return handleNext(snack);
    }
}
