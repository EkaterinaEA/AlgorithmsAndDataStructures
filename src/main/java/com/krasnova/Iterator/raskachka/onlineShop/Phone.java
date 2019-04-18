package com.krasnova.Iterator.raskachka.onlineShop;

public class Phone extends Technic {

    public String os;

    public Phone(double price, String color, String brand, String os) {
        super(price, color, brand);
        this.os = os;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
