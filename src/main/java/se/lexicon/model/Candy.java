package se.lexicon.model;

public final class Candy extends Product {

    private CandyType type;
    private CandyTaste taste;

    // private boolean carbo;

    public Candy(double price, String productName, CandyTaste taste, CandyType type) {
        super(price, productName);
        this.taste = taste;
        this.type = type;
    }

    public Candy(double price, String productName, CandyTaste taste) {
        super(price, productName);
        this.taste = taste;
    }

    @Override
    public String examine() {
        return "Product name: " + getProductName() + " , Taste: " + taste + " , Type: " + type + " , Price: " + getPrice();
    }

    @Override
    public String use() { return "Product name: " + getProductName() + " , Price: " + getPrice();
    }
}