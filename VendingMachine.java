import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    public StateOfVendingMachine state;
    private Snack currentSnack;
    private double insertedMoney;
    private List<Snack> snacks;

    public VendingMachine() {
        state = new IdleState(this);
        snacks = new ArrayList<>();
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public void addSnack(Snack snack) {
        snacks.add(snack);
    }
}
