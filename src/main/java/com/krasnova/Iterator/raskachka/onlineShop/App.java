package com.krasnova.Iterator.raskachka.onlineShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    private static Technic technics[] = new Technic[20];

    public static void main(String[] args) throws IOException {

        int enteredNumber;

        do {
            System.out.println("1. Купить технику");
            System.out.println("2. Добавить технику");
            System.out.println("3. Выход");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Выберите действие: ");
            enteredNumber = readNumber(reader);

            if (enteredNumber == 1){
                printTechnic();
                System.out.println("\n1. Найти технику по номеру");
                System.out.println("2. Найти технику по названию");

                int brandOrNumber = readNumber(reader);
                if (brandOrNumber == 1) {
                    System.out.println("Введите номер техники: ");
                    int number = readNumber(reader);
                    searchIndex(number);
                } else if (brandOrNumber == 2){
                    System.out.println("Введите название техники: ");
                    String brand = reader.readLine();
                    int i=0;
                    for (i=0; i<technics.length; i++){
                        if (technics[i].getBrand().equals(brand)){
                            System.out.println("Товар " + technics[i].toString() + " добавлен в корзину");
                            break;
                        }
                    }
                }
            }

            if (enteredNumber == 2){
                System.out.println("Введите категорию техники для добавления: ");
                System.out.println("1. TV");
                System.out.println("2. Phone");
                int technicNumber = readNumber(reader);
                addTechnic(technicNumber, reader);
                printTechnic();
            }
        }
        while (enteredNumber != 3);
    }

    private static void printTechnic(){
        for (int i=0; i<technics.length; i++){
            if (technics[i] != null){
                System.out.println((i+1) + ". " + technics[i].toString());
            }
        }
    }

    private static int readNumber(BufferedReader reader) throws IOException {
        String command = reader.readLine();
        return Integer.parseInt(command);
    }

    private static void searchIndex(int number){
        int i;
        for (i=0; i<technics.length; i++){
            if ((i+1) == number){
                System.out.println("Товар " + technics[i].toString() + " добавлен в корзину");
            }
        }
    }

    private static void addTechnic(Technic technic){
        for (int i=0; i<technics.length; i++){
            if (technics[i] == null){
                technics[i] = technic;
                break;
            }
        }
    }

    private static void addTechnic(int technicNumber, BufferedReader reader) throws IOException {
        System.out.println("Введите brand: ");
        String brand = reader.readLine();
        System.out.println("Введите цвет: ");
        String color = reader.readLine();
        System.out.println("Введите цену: ");
        double price = Double.parseDouble(reader.readLine());

        if (technicNumber == 1){
            System.out.println("Введите диагональ: ");
            double diagonal = Double.parseDouble(reader.readLine());
            addTechnic(new TV(price, color, brand, diagonal));
        } else if (technicNumber == 2){
            System.out.println("Введите os: ");
            String os = reader.readLine();
            addTechnic(new Phone(price, color, brand, os));
        }
    }
}
