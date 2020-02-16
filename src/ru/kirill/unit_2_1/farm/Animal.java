package ru.kirill.unit_2_1.farm;

/**
 * Адстрактный класс описывающий общие для всех животных
 */
public abstract class Animal {

    /**
     * Вес корма, которую животное съедает за сутки.
     */
    private int foodWeight;
    /**
     * Площадь загона, необходимая животному.
     */
    private int spaceRequired;
    /**
     * Объем отходов.
     */
    private int garbageVolume;

    /**
     * Геттер для поля foodWeight.
     * @return вес корма, необходимый животному.
     */
    public int getFoodWeight() {
        return foodWeight;
    }

    /**
     * Сеттер для поля foodWeight.
     * @param foodWeight вес корма, необходимый животному в сутки.
     */
    public void setFoodWeight(int foodWeight) {
        this.foodWeight = foodWeight;
    }

    /**
     * Геттер для поля spaceRequired.
     * @return площадь загона, необходимая животному.
     */
    public int getSpaceRequired() {
        return spaceRequired;
    }

    /**
     * Сеттер для поля spaceRequired.
     * @param spaceRequired площадь загона, необходимая животному.
     */
    public void setSpaceRequired(int spaceRequired) {
        this.spaceRequired = spaceRequired;
    }

    /**
     * Геттер для поля garbageVolume.
     * @return объем отходов.
     */
    public int getGarbageVolume() {
        return garbageVolume;
    }

    /**
     * Сеттер для поля garbageVolume.
     * @param garbageVolume объем отходов.
     */
    public void setGarbageVolume(int garbageVolume) {
        this.garbageVolume = garbageVolume;
    }

    /**
     * Абстрактый метод - должен быть переопределен в наследниках.
     */
    public abstract void step();

    /**
     * Общий для всех животных метод. Может быть переопределен (а может и нет) в наследниках.
     * @param food объем съеденного корма.
     */
    public void eat(int food) {
        System.out.println("animal eat all");
    }

    /**
     * Общий для всех животных метод возвращающий клеймо в нужном формате.
     * @return клеймо в едином формате.
     */
    public String getStamp() {
        return "+++" + readStamp() + "+++";
    }

    /**
     * Абстрактный метод, возвращающий клеймо животного. Реализация должна быть определена в наследниках.
     * @return клеймо.
     */
    protected abstract String readStamp();

}
