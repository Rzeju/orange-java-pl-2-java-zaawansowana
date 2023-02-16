package pl.sda.oop.polymorphism_level_2;

//klasa abstrakcyjna Animal
public abstract class Animal {

    //pole klasy
    private String name;

    //konstruktor z jednym argumentem
    public Animal(String name) {
        this.name = name;
    }

    //metoda abstrakcyjna w klasie Animal
    //nie posiada implementacji
    public abstract String getSound();

    //getter dla pola name
    //zwraca wartość tego pola
    public String getName() {
        return name;
    }

}

