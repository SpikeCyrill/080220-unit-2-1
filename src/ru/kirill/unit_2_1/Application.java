package ru.kirill.unit_2_1;

public class Application {

    public static void main(String[] args) {
        Person myFirstPerson = new Person("Kirill", "Kolosov");

        /*myFirstPerson.name = "Kirill";
        myFirstPerson.surname = "Kolosov";*/
        myFirstPerson.age = 18;

        /*String fullName = myFirstPerson.sayYourName();*/

        Person mySecondPerson = new Person("Olga", "Ivanova");

        /*mySecondPerson.name = "Olga";
        mySecondPerson.surname = "Ivanova";*/
        mySecondPerson.age = 18;

        /*String secondFullName = mySecondPerson.sayYourName();

        System.out.println(fullName);
        System.out.println(secondFullName);*/

        printPerson(myFirstPerson);
        printPerson(mySecondPerson);

        Person[] personsArray = new Person[2];

        personsArray[0] = myFirstPerson;
        personsArray[1] = mySecondPerson;

        System.out.println(myFirstPerson.getNumberOfEyes());
        System.out.println(mySecondPerson.getNumberOfEyes());

        EmptyClass empty = new EmptyClass();


        int int1 = 100;
        int int2 = 100;
        boolean intResult = int1 == int2;
        System.out.println("int1 == int2 : " + intResult);

        Person person1 = new Person("Ivan", "Ivanov");
        Person person2 = new Person("Ivan", "Ivanov");
        boolean personResult = person1 == person2;
        System.out.println("person1 == person2 : " + personResult);

        int2 = int1;
        int1 = 89;
        System.out.println("int1 : " + int1);
        System.out.println("int2 : " + int2);

        person2 = person1;
        person1.name = "Vasya";

        System.out.println(person1.sayYourName());
        System.out.println(person2.sayYourName());

    }

    public static void printPerson(Person personToPrint) {
        String fullName = personToPrint.sayYourName();
        System.out.println(fullName);
    }

    public static void varExample(int param) {

        int int1 = 10;

        if(int1 == 10) {
            int int2 = 100;
        } else {
            int1 = 50;
        }
    }

}
