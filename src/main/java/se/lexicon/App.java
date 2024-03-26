package se.lexicon;

import se.lexicon.model.*;

public class App
{
    public static void main( String[] args )
    {
        Drink apple = new Drink(10, "Water", "Lemon taste", true );
        Drink cola = new Drink(10, "Cola", "Lemon taste" );
        System.out.println("apple = " + apple.examine());
        System.out.println("cola = " + cola.examine());

        Candy gummi = new Candy(20, "tuggummi", CandyTaste.MINT, CandyType.GUM);
        System.out.println("gummi =" + gummi.examine());

        Candy tablet = new Candy(25, "Läkerol", CandyTaste.CHILI);
        System.out.println("tablet =" + tablet.examine());

        Snacks popcorn = new Snacks("Poppisar", SnackType.POPCORN, "chilli");
        System.out.println("Smack = " + popcorn.examine());

    }
}