package ru.kirill.unit_2_1.farm;

public abstract class Animal {

    private int foodWeight;
    private int spaceRequired;
    private int garbageVolume;


    public int getFoodWeight() {
        return foodWeight;
    }

    public void setFoodWeight(int foodWeight) {
        this.foodWeight = foodWeight;
    }

    public int getSpaceRequired() {
        return spaceRequired;
    }

    public void setSpaceRequired(int spaceRequired) {
        this.spaceRequired = spaceRequired;
    }

    public int getGarbageVolume() {
        return garbageVolume;
    }

    public void setGarbageVolume(int garbageVolume) {
        this.garbageVolume = garbageVolume;
    }

    public abstract void step();

    public void eat(int food) {
        System.out.println("animal eat all");
    }

    public String getStamp() {
        return "+++" + readStamp() + "+++";
    }

    protected abstract String readStamp();

}
