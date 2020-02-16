package ru.kirill.unit_2_1.farm;

/**
 * Лошадь, потомок класса "животное".
 */
public class Horse extends Animal implements Swimmable {

    /**
     * Переопределенный метод родительского класса.
     */
    @Override
    public void step() {
        System.out.println("horse step");
    }

    /**
     * Переопределенный метод интерфейса Swimmable.
     */
    @Override
    public void swim() {
        System.out.println("horse swims");
    }

    /**
     * Переопределенный метод родительского класса.
     * @return клеймо именно этой лошади (этого объекта).
     */
    @Override
    protected String readStamp() {
        return "horse";
    }

}
