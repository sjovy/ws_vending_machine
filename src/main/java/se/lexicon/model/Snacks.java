package se.lexicon.model;

public class Snacks extends Product {

    private SnackType type;
    private String taste;

    public Snacks(String productName, SnackType type, String taste) {
        super(type.getPrice(), productName);
        this.taste = taste;
        this.type = type;
    }

    @Override
    public String examine() {
        return "Name: " + getProductName() + ", Type: " + type + ", Taste: " + taste + ", Price: " + getPrice();
    }

    @Override
    public String use() {
        return "Product name: " + getProductName() + " , Price: " + getPrice();
    }
}
