package Exam1011;

public class IceCream extends Product implements Consumable,Lickable{
    public IceCream(String name, double price, Size size) {
        super(name, price, size);
    }

    @Override
    public void consume() {
        System.out.println("I am Delicious");

    }

    @Override
    public boolean safeToLick() {
        return true;
    }
}
