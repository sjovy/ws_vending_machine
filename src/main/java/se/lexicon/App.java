package se.lexicon;

import se.lexicon.model.*;

import java.util.Arrays;

public class App
{
    public static void main(String[] args) {
        Drink apple = new Drink(10, "Water", "Lemon taste", true); // 1
        Drink cola = new Drink(10, "Cola", "Lemon taste"); // 2
        Candy chocolate = new Candy(20, "Kinder Kids", CandyTaste.SWEET, CandyType.CHOCOLATE); // 3
        // Snacks chips = new Snacks(20,"Chitoz", SnackType.CHIPS, "Salty"); // 4

        Product[] products = {apple, cola, chocolate};

        VendingMachine vendingMachine1 = new VendingMachine(products);
        vendingMachine1.addCurrency(10);
        System.out.println(vendingMachine1.getBalance()); // 10
        vendingMachine1.addCurrency(5);
        System.out.println(vendingMachine1.getBalance()); // 15

        System.out.println(Arrays.toString(vendingMachine1.getProducts()));

        // call request method 4

        vendingMachine1.request(1);
        System.out.println(vendingMachine1.getBalance());
        System.out.println(Arrays.toString(vendingMachine1.getProducts()));
        System.out.println(vendingMachine1.getDescription(1));


    }
}