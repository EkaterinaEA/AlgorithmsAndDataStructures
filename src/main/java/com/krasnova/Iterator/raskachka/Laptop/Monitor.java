package com.krasnova.Iterator.raskachka.Laptop;

public class Monitor {

    public String matrixType;
    public double diagonal;
    public String manufacturer;


    public Monitor(String matrixType, double diagonal, String manufacturer) {
        this.matrixType = matrixType;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }

    public Monitor() {
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "matrixType='" + matrixType + '\'' +
                ", diagonal=" + diagonal +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
