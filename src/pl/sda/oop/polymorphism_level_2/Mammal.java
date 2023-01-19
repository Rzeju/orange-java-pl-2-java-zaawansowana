package pl.sda.oop.polymorphism_level_2;

public abstract class Mammal extends Animal {

    private String movementKind;

    public Mammal(String name, String movementKind) {
        super(name);
        this.movementKind = movementKind;
    }

    public abstract void drink();

    public String getMovementKind() {
        return  movementKind;
    }
}
