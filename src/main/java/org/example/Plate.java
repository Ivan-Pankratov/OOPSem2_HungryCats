package org.example;

public class Plate{
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void refill(int food){
        this.food = this.food + food;
        System.out.println("plate + " + food);
    }

}
