public class SnickersHandler extends SnackDispenseHandler {
    @Override
    public boolean handle(Snack snack) {
        if (snack.getName().equalsIgnoreCase("Snickers")) {
            System.out.print("Dispensing Snickers.");
            return true;
        }
        return handleNext(snack);
    }
}
