package ru.kirill.unit_2_1.farm;

/**
 * Овца, потомок класса "животное".
 */
public class Sheep extends Animal {

    /**
     * Объем шерсти.
     */
    private int woolVolume;

    /**
     * Геттер для поля woolVolume.
     * @return объем шерсти.
     */
    public int getWoolVolume() {
        return woolVolume;
    }

    /**
     * Сеттер для поля woolVolume.
     * @param woolVolume объем шерсти.
     */
    public void setWoolVolume(int woolVolume) {
        this.woolVolume = woolVolume;
    }

    /**
     * Переопределенный метод родительского класса.
     */
    @Override
    public void step() {
        System.out.println("sheep step");
    }

    /**
     * Метод объекта.
     */
    public void cut() {
        System.out.println("sheep cuts");
    }

    /**
     * Переопределенный метод родительского класса.
     * @return клеймо именно этой овцы (этого объекта).
     */
    @Override
    protected String readStamp() {
        return "sheep";
    }

}
