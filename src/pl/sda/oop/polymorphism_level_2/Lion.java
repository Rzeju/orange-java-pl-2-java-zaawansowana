package pl.sda.oop.polymorphism_level_2;

public class Lion extends Mammal {


    public Lion(String name, String movementKind) {
        super(name, movementKind);
    }

    @Override
    public String getSound() {
        return "WRrrr Lion";
    }

    @Override
    public void drink() {
        System.out.println("Drinking lion milk!");
    }

    public void lionMethod() {}

}
