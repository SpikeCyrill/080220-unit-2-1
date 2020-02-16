package ru.kirill.unit_2_1;

/**
 * Класс представляющий сущность "человек".
 */
public class Person {

    /**
     * Статическая переменная - перенная уровня класса, доступна по имени класса без создания объекта.
     */
    static byte numberOfEyes = 2;

    /**
     * Имя.
     */
    String name;
    /**
     * Фамилия.
     */
    String surname;

    /**
     * Возраст.
     */
    byte age;

    /**
     * Конструктор.
     * @param name имя.
     * @param surname фамилия.
     */
    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        //System.out.println("!Constructor invoked!");
    }

    /**
     * Метод возвращает полное имя человека и возраст.
     * @return полное имя и возраст, разделенные пробелом.
     */
    String sayYourName() {
        return name + " " + surname + " " + age;
    }

    /**
     * Метод возвращает значение статической переменной.
     * @return количество глаз.
     */
    byte getNumberOfEyes() {
        return numberOfEyes;
    }

    /**
     * Бессмысленный метод, возвращающий ссылку на самого себя.
     * @return ссылка на объект, у которого вызвали этот метод.
     */
    Person getMyLink() {
        return this;
    }
}
