package org.example;

public class Other {

    //метод кормления
    public static boolean eating (Cat cat, Plate plate){

        if ((plate.getFood() - cat.getAppetite()>=0) && !cat.isSatiety()){
            plate.setFood(plate.getFood() - cat.getAppetite());
            cat.setSatiety(true);
            //cat.satietyInfo();
            //plate.info();
            return true;
        }
        else {
            cat.satietyInfo();
            plate.info();
            System.out.println("Тарелку надо пополнить");
            return false;
        }

    }
}
