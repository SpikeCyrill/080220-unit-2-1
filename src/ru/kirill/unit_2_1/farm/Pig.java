package ru.kirill.unit_2_1.farm;

public class Pig extends Animal {

    private int weight;

    public int getWeight() {
        return weight;
    }

    @Override
    public void step() {
        System.out.println("pig step");
    }

    @Override
    public void eat(int food) {
        weight += food;
        System.out.println("animal eats like a pig");
    }

    @Override
    protected String readStamp() {
        return "pig";
    }

}
