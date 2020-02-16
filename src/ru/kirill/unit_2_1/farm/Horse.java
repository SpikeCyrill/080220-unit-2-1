package ru.kirill.unit_2_1.farm;

public class Horse extends Animal implements Swimmable {
    @Override
    public void step() {
        System.out.println("horse step");
    }

    @Override
    public void swim() {
        System.out.println("horse swims");
    }

    @Override
    protected String readStamp() {
        return "horse";
    }

}
