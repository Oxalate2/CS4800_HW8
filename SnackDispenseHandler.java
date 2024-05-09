public abstract class SnackDispenseHandler {
    private SnackDispenseHandler next;
    public SnackDispenseHandler setNextHandler(SnackDispenseHandler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(Snack snack);

    protected boolean handleNext(Snack snack) {
        if (next == null) {
            return true;
        }
        return next.handle(snack);
    }
}
