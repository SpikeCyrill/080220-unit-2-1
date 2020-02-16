package ru.kirill.unit_2_1;

import ru.kirill.unit_2_1.farm.Animal;
import ru.kirill.unit_2_1.farm.Horse;
import ru.kirill.unit_2_1.farm.Pig;
import ru.kirill.unit_2_1.farm.Sheep;
import ru.kirill.unit_2_1.farm.birds.Chick;
import ru.kirill.unit_2_1.farm.birds.Duck;

/**
 * Главный класс приложения, содержащий метод main.
 */
public class Application {

    /**
     * Основной метод - точка входа (запуска) приложения.
     * @param args аргумента, которые передаются при запуске приложения.
     */
    public static void main(String[] args) {
        classExample();
        farmExamples();
    }

    /**
     * Пример работы с классом.
     */
    public static void classExample() {
        Person myFirstPerson = new Person("Kirill", "Kolosov"); //создаем объект

        /*myFirstPerson.name = "Kirill";
        myFirstPerson.surname = "Kolosov";*/
        myFirstPerson.age = 18; // меняем значение поля объекта

        /*String fullName = myFirstPerson.sayYourName();*/

        Person mySecondPerson = new Person("Olga", "Ivanova");

        /*mySecondPerson.name = "Olga";
        mySecondPerson.surname = "Ivanova";*/
        mySecondPerson.age = 18;

        /*String secondFullName = mySecondPerson.sayYourName();

        System.out.println(fullName);
        System.out.println(secondFullName);*/

        printPerson(myFirstPerson); // вызываем метод, передавая ссылку на объект в качестве параметра.
        printPerson(mySecondPerson);

        Person[] personsArray = new Person[2]; //создаем массив объектов ссылочного типа.

        personsArray[0] = myFirstPerson; // кладем ссылку на объект в ячейку массива.
        personsArray[1] = mySecondPerson;

        System.out.println(myFirstPerson.getNumberOfEyes()); // выводим в консоль результат выполнения метода объекта.
        System.out.println(mySecondPerson.getNumberOfEyes());

        EmptyClass empty = new EmptyClass(); // создаем пустой объект.


        // Объявляем две переменные примитивного типа с одинаковым значением и сравниваем их.
        int int1 = 100;
        int int2 = 100;
        boolean intResult = int1 == int2;
        System.out.println("int1 == int2 : " + intResult);

        // Объявляем две переменные ссылочного типа, ссылающиеся на разные объекты с одинаковым состоянием и сравниваем их.
        Person person1 = new Person("Ivan", "Ivanov");
        Person person2 = new Person("Ivan", "Ivanov");
        boolean personResult = person1 == person2;
        System.out.println("person1 == person2 : " + personResult);

        // Перевладываем значение из одной переменной примитивного типа в другую и оцениваем результат.
        int2 = int1;
        int1 = 89;
        System.out.println("int1 : " + int1);
        System.out.println("int2 : " + int2);

        // Перевладываем ссылку из одной переменной ссылочного типа в другую и оцениваем результат.
        person2 = person1;
        person1.name = "Vasya";

        System.out.println(person1.sayYourName());
        System.out.println(person2.sayYourName());
    }

    /**
     * Выводит в консоль полное имя личности.
     * @param personToPrint личность.
     */
    public static void printPerson(Person personToPrint) {
        String fullName = personToPrint.sayYourName();
        System.out.println(fullName);
    }

    /**
     * Пример объявления переменных в разных блоках кода.
     * @param param целочисленное значение.
     */
    public static void varExample(int param) {

        int int1 = 10;

        if(int1 == 10) {
            int int2 = 100;
        } else {
            int1 = 50;
        }
    }

    /**
     * Пример работы с использованием полиморфизма.
     */
    public static void farmExamples() {
        Pig pig = new Pig();
        Duck duck = new Duck();

        Animal[] animals = new Animal[5];
        animals[0] = new Pig();
        animals[1] = new Horse();
        animals[2] = new Sheep();
        animals[3] = new Duck();
        animals[4] = new Chick();

        for(int i = 0; i < animals.length; i++) {
            animals[i].eat(10);
            animals[i].step();

            if(animals[i] instanceof Sheep) {
                Sheep sheep = (Sheep) animals[i];
                sheep.cut();
                System.out.println("WOW the sheep is here!");
            }
        }

        System.out.println("Stamps:");
        printHerdStamps(animals);

    }


    /**
     * Выводит в консоль клеймо всех животных из коллекции.
     * @param animals коллекция животных.
     */
    public static void printHerdStamps(Animal[] animals) {
        for(int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getStamp());
        }
    }

}
