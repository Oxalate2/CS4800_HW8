public class DoritosHandler extends SnackDispenseHandler {
    @Override
    public boolean handle(Snack snack) {
        if (snack.getName().equalsIgnoreCase("Doritos")) {
            System.out.print("Dispensing Doritos.");
            return true;
        }
        return handleNext(snack);
    }
}
