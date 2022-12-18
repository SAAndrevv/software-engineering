package ru.saandrew;

public class Delivery {

    private Delivery() {

    }

    public static Delivery instance() {
        return new Delivery();
    }

    public void delivery(String customerName) {
        System.out.println("delivered to " + customerName);
    }
}
