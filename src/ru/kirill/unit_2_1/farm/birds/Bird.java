package ru.kirill.unit_2_1.farm.birds;

import ru.kirill.unit_2_1.farm.Animal;

/**
 * Абстрактный класс, содержащий общее для всех птиц поле. Потомок класса "Животное".
 */
public abstract class Bird extends Animal {
    /**
     * Количество снесенных яиц.
     */
    protected int eggsNumber;
}
