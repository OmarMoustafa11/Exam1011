package Exam1011;

public class Battery extends Product implements Consumable{
    public Battery(String name, double price, Size size) {
        super(name, price, size);
    }

    @Override
    public void consume() {
        System.out.println("You eat me You DIEE");
    }

}
