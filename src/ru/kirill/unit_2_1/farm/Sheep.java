package ru.kirill.unit_2_1.farm;

public class Sheep extends Animal {

    private int woolVolume;

    public int getWoolVolume() {
        return woolVolume;
    }

    public void setWoolVolume(int woolVolume) {
        this.woolVolume = woolVolume;
    }

    @Override
    public void step() {
        System.out.println("sheep step");
    }

    public void cut() {
        System.out.println("sheep cuts");
    }

    @Override
    protected String readStamp() {
        return "sheep";
    }

}
