package com.krasnova.raskachka.Laptop;

public class App {
    public static void main(String[] args) {
        Laptop laptopArray[] = new Laptop[]{
          new Laptop (3, 4, 9, true, new Monitor("ips", 5, "Lenovo")),
                new Laptop(3, 4, 9, true, new Monitor("ips", 5, "Lenovo")),
                new Laptop(3, 4, 9, true, new Monitor("ips", 5, "Lenovo")),
                new Laptop(3, 4, 9, true, new Monitor("ips", 5, "Lenovo")),
                new Laptop(3, 4, 9, true, new Monitor("ips", 5, "Lenovo"))
        };

        for (int i=0; i<laptopArray.length; i++){
            System.out.println(laptopArray[i].toString());
        }
    }
}
