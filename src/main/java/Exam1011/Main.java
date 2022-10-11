package Exam1011;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("OmarMoustafa11","PaSsWoRd!");

        ArrayList<String> addresses  = new ArrayList<>();
        addresses.add("Old Capital tr Newark De 19720");
        addresses.add("Christiana rd Newark De 19702");
        addresses.add("Temple Terr Wilmington De 19804");

        IceCream iceCream = new IceCream("Cookie Dough",4.00,Size.S);
        Battery battery = new Battery("Enegizer",8.00,Size.M);
        PostalStamp postalStamp = new PostalStamp("Penny Black", 0.60,Size.L,10);

        Product[] products = {iceCream,battery,postalStamp};


        Customer customer1 = new Customer("Mike_Jones","Mike1",90,100.0,addresses,Size.M,products);
        Customer customer2 = new Customer("Billy_Bob","Bob1",0,500.0,addresses,null,products);
        Customer customer3 = new Customer("LL_Cooljay","LL1",0,250.0,addresses,null,products);


        System.out.println("===Get and print out customer1's balance===");
        System.out.println(customer1.getAccountBalance());
        System.out.println("===useRewardPoints===");
        System.out.println("You just used 10 points and now you have " + customer1.useRewardPoints + " points left");
        System.out.println("=== getSecondaryAddressOfCustomer of customer1===");
        App.getSecondaryAddressOfCustomer(customer1);
        System.out.println("=== Print customer1's info with the print() method===");
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println("admin name is; " + admin);
        System.out.println("===getTotalPriceOfCustomerProducts===");
        //App.getTotalPriceOfCustomerProducts();
        System.out.println("===reverseSortAndPrintAllProductsbyPrice");
        //App.reverseSortandPrintAllProductsByPrice();




































    }
}
