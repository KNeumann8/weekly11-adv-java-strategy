package discount;

public class BillTypeS implements BillStrategy {
    @Override
    public double getBillAmount(double billAmount) {
        billAmount = billAmount - (billAmount * 0.1);
        return billAmount;
    }

}
