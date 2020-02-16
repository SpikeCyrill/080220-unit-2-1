package ru.kirill.unit_2_1.farm.birds;

/**
 * Курица, потомок класса "Птица".
 */
public class Chick extends Bird {

    /**
     * Переопределенный метод родительского класса.
     */
    @Override
    public void step() {
        System.out.println("Chick step");
    }

    /**
     * Переопределенный метод родительского класса.
     * @return клеймо именно этой курицы (этого объекта).
     */
    @Override
    protected String readStamp() {
        return "Chick";
    }

}
