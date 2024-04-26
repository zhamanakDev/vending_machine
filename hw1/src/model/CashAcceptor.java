package model;

public class CashAcceptor implements PaymentAcceptor {
    private int amount;

    public CashAcceptor(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
