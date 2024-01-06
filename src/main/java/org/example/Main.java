package org.example;

import static org.example.Other.eating;

public class Main {
    public static void main(String[] args) {

        // Создание массива котов
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Барсик", 15),
                new Cat("Персик", 10),
                new Cat("Вареник", 20),
                new Cat("Пушок", 25),
        };

        Plate plate = new Plate(50);  //тарелка
        for (Cat cat: cats){
            if (!eating(cat, plate)){       // кормим: если не хватило,
                plate.refill(50);     //... пополняем тарелку
                //plate.info();
                eating(cat, plate);};       //... и снова кормим
        }
        System.out.println("Все котики сыты.");  // отчёт о сытости

    }

}