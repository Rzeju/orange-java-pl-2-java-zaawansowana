package pl.sda.oop.polymorphism_level_2;

//klasa abstrakcyjna Mammal
//klasa ta dziedziczy po innej klasie abstrakcyjnej Animal
public abstract class Mammal extends Animal {

    //pole w klasie Mammal
    private String movementKind;

    //konstruktor z dwoma argumentami
    //klasa Mammal dziedziczy pola ze swoje nadklasy Animal
    public Mammal(String name, String movementKind) {
        //super odwołuje się do nadklasy
        //w tym przypadku wywoływany jest konstruktor klasy Animal
        super(name);
        this.movementKind = movementKind;
    }

    //metoda abstrakcyjna w klasie Mammal
    //nie posiada implementacji
    public abstract void drink();

    //getter dla pola movementKind
    //zwraca wartość tego pola
    public String getMovementKind() {
        return  movementKind;
    }
}
