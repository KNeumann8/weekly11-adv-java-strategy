package discount;

public class BillTypeL implements BillStrategy{
    @Override
    public double getBillAmount(double billAmount) {
        billAmount = billAmount - (billAmount * 0.75);
        return billAmount;
    }
}
