package se.lexicon.model;

public enum SnackType {

    POPCORN(10),
    CHIPS(15),
    CHEEZDOODLES(20);

    private final double price;

    SnackType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
