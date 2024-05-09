public class CheetosHandler extends SnackDispenseHandler {
    @Override
    public boolean handle(Snack snack) {
        if (snack.getName().equalsIgnoreCase("Cheetos")) {
            System.out.print("Dispensing Cheetos.");
            return true;
        }
        return handleNext(snack);
    }
}
