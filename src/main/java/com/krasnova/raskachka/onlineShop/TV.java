package com.krasnova.raskachka.onlineShop;

public class TV extends Technic {

    public double diagonal;

    public TV(double price, String color, String brand, double diagonal) {
        super(price, color, brand);
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "TV{" +
                "diagonal=" + diagonal +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
