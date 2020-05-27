package discount;

public class BillTypeDefault implements BillStrategy{
    @Override
    public double getBillAmount(double billAmount) {
        return billAmount;
    }
}
