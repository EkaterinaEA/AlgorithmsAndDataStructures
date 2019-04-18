package com.krasnova.raskachka.Laptop;

public class Laptop {

    public double weight;
    public double cpu;
    public double ram;
    public boolean turboMode;
    Monitor monitor;

    public Laptop(double weight, double cpu, double ram, boolean turboMode, Monitor monitor) {
        this.weight = weight;
        this.cpu = cpu;
        this.ram = ram;
        this.turboMode = turboMode;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", turboMode=" + turboMode +
                ", monitor MatrixType=" + monitor.getMatrixType() +
                ", monitor diagonal=" + monitor.getDiagonal() +
                ", monitor manufacturer=" + monitor.getManufacturer() +
                '}';
    }
}
