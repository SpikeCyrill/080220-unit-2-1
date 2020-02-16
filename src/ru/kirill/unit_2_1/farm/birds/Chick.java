package ru.kirill.unit_2_1.farm.birds;

public class Chick extends Bird {
    @Override
    public void step() {
        System.out.println("Chick step");
    }

    @Override
    protected String readStamp() {
        return "Chick";
    }

}
