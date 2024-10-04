package Assignment2FlyWeight;

import java.util.HashMap;
import java.util.Map;

//members:
//Ruslan Matveyev
//Yerassyl Zekebayev
class AnimalType {
    private String type;
    public String family;

    public AnimalType(String type, String family) {
        this.type = type;
        this.family = family;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void printInfo(String name, int age) {
        System.out.println("Animal: " + type + ", from family " + family + ", its name is " + name + ", its age is " + age);
    }
}

class AnimalFactory {
    private static Map<String, AnimalType> AnimalTypes = new HashMap<>();

    public static AnimalType getAnimalType(String type, String family) {
        AnimalType result = AnimalTypes.get(type);
        if (result == null) {
            result = new AnimalType(type, family);
            AnimalTypes.put(type, result);
        }
        return result;
    }
}

class Animal {
    private String name;
    private int age;
    private AnimalType type;

    public Animal(String name, int age, AnimalType type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void printDetails() {
        type.printInfo(name, age);
    }
}

public class Assignment2Flyweight {
    public static void main(String[] args) {
        AnimalType dogType = AnimalFactory.getAnimalType("Dog", "Canidae");
        AnimalType catType = AnimalFactory.getAnimalType("Cat", "Felidae");
        AnimalType hamsterType = AnimalFactory.getAnimalType("Hamster", "Rodents");

        Animal animal1 = new Animal("Max", 5, hamsterType);
        Animal animal2 = new Animal("Bella", 3, dogType);
        Animal animal3 = new Animal("Luna", 2, catType);

        animal1.printDetails();
        animal2.printDetails();
        animal3.printDetails();
    }
}