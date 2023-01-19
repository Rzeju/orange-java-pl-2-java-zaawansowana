package pl.sda.oop.polymorphism_level_2;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getSound();

    public String getName() {
        return name;
    }

}

