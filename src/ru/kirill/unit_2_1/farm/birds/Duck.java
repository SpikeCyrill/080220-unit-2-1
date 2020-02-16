package ru.kirill.unit_2_1.farm.birds;

import ru.kirill.unit_2_1.farm.Swimmable;

public class Duck extends Bird implements Swimmable {
    @Override
    public void step() {
        System.out.println("duck step");
    }

    @Override
    public void swim() {
        System.out.println("dusk swims");
    }

    @Override
    protected String readStamp() {
        return "duck";
    }
}
