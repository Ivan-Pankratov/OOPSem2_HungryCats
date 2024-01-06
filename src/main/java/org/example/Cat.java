package org.example;

public class Cat{
    private String name;
    private boolean satiety;
    private int appetite;

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }


    public void satietyInfo(){
        if (isSatiety()){
            System.out.printf("%s сыт, ",getName());
        }
        else {
            System.out.printf("%s голоден, ",getName());
        }
    }
}
