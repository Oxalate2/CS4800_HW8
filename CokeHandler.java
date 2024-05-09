public class CokeHandler extends SnackDispenseHandler {
    @Override
    public boolean handle(Snack snack) {
        if (snack.getName().equalsIgnoreCase("Coke")) {
            System.out.print("Dispensing Coke.");
            return true;
        }
        return handleNext(snack);
    }
}
