package com.krasnova.raskachka.onlineShop;

public class Technic {

    public double price;
    public String color;
    public String brand;

    public Technic(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Technic{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }
}
