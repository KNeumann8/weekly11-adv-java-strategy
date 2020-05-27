package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private char discountType;

    private BillStrategy billStrategy;

    public CustomerOrder(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;
        setBillStrategy(discountType);
    }

    public void setBillStrategy(char discountType) {

        switch (discountType) {
            case 'S':
            case 's':
                billStrategy = new BillTypeS();
                break;
            case 'D':
            case 'd':
                billStrategy = new BillTypeD();
                break;
            case 'L':
            case 'l':
                billStrategy = new BillTypeL();
                break;
            default:
                billStrategy = new BillTypeDefault();
        }

    }

    public double getBillAmount(){
        return billStrategy.getBillAmount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }
}
