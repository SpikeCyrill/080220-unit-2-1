package ru.kirill.unit_2_1.farm.birds;

import ru.kirill.unit_2_1.farm.Swimmable;

/**
 * Лошадь, потомок класса "Птица".
 */
public class Duck extends Bird implements Swimmable {

    /**
     * Переопределенный метод родительского класса.
     */
    @Override
    public void step() {
        System.out.println("duck step");
    }

    /**
     * Переопределенный метод интерфейса Swimmable.
     */
    @Override
    public void swim() {
        System.out.println("dusk swims");
    }

    /**
     * Переопределенный метод родительского класса.
     * @return клеймо именно этой утки (этого объекта).
     */
    @Override
    protected String readStamp() {
        return "duck";
    }
}
