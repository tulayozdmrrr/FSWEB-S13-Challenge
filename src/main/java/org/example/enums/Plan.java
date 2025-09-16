package org.example.enums;

public enum Plan {
    BASIC("Basic Plan", 100),
    PREMIUM("Premium Plan", 200);

    private final String name;
    private final int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
}
