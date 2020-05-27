package discount;

public class BillTypeD implements BillStrategy {
    @Override
    public double getBillAmount(double billAmount) {
        billAmount = billAmount - (billAmount * 0.5);
        return billAmount;
    }
}
