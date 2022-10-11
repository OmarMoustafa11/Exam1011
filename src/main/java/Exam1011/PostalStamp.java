package Exam1011;

public class PostalStamp extends Product implements Lickable,Iprint{

    private int amount;

    public PostalStamp(String name, double price, Size size, int amount) {
        super(name, price, size);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean safeToLick() {
        return true;
    }

    @Override
    public void print() {
        System.out.println("I print labels");
    }
}
