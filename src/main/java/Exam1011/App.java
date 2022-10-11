package Exam1011;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

public class App {

    public static void printAllPrintableObjects(Iprint[] printables){
//        for (Iprint prints : printables){
//            Iprint.print();
//        }
        for (int i = 0; i < printables.length ; i++) {
            printables[i].print();

        }

    }

    public static void consumeConsumables(Consumable[] consume){
//        for(Consumable x : consume){
//            Consumable.consume();
//        }
        for (int i = 0; i < consume.length ; i++) {
            consume[i].consume();
        }
    }
public static void getTotalPriceOfCustomerProducts(Customer customer){
    double price = 0;
   // for (int i = 0; i < customer.getProducts(price); i++) {

    }


public static String getSecondaryAddressOfCustomer(Customer customer) {
    String secondaryAddress = "";
    for (int x = 0; x < customer.getAddresses().indexOf(1); x++) {
        secondaryAddress = customer.getAddresses().get(1);

    }
    System.out.println(secondaryAddress);
    return secondaryAddress;
}
public static void reverseSortandPrintAllProductsByPrice(ArrayList<Product> products){
    Collections.sort(products, new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getPrice() > o2.getPrice())
            return 1;
            else
                return -1;
        }

    });

}

public double getListOfProductPricesGreaterThanThePriceOfProductGiven(ArrayList<Product> products){
        return  0.0;
}



//public static void addASingleProductToDirectoryTiedToCustomerByNameThenPrint(Map<String,Product> Customer, Product){}






































}
