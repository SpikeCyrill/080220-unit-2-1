package ru.kirill.unit_2_1.farm;

/**
 * Свинья, потомок класса "животное".
 */
public class Pig extends Animal {

    /**
     * Вес животного.
     */
    private int weight;

    /**
     * Геттер для поля weight.
     * @return вес животного.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Переопределенный метод родительского класса.
     */
    @Override
    public void step() {
        System.out.println("pig step");
    }

    /**
     * Переопределенный метод родительского класса.
     * @param food объем съеденного корма.
     */
    @Override
    public void eat(int food) {
        weight += food;
        System.out.println("animal eats like a pig");
    }

    /**
     * Переопределенный метод родительского класса.
     * @return клеймо именно этой свиньи (этого объекта).
     */
    @Override
    protected String readStamp() {
        return "pig";
    }

}
