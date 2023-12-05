package model;

public class Product {
    protected String name;
    protected char actionLetter;
    protected int price;

    public Product(String name, char actionLetter, int price) {
        this.name = name;
        this.actionLetter = actionLetter;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public char getActionLetter() {
        return actionLetter;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String str = "[%s] - %s";
        return String.format(str, price, name);
    }
}
