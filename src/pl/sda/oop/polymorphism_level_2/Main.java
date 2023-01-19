package pl.sda.oop.polymorphism_level_2;

public class Main {

    public static void main(String[] args) {

        Lion lion = new Lion("Lew 1", "Walking");
        String lionsSound = lion.getSound();
        System.out.println(lion.getSound());
        lion.drink();
        lion.lionMethod();

        Mammal myMammal = lion;
        myMammal.drink();
        myMammal.getSound();
        myMammal.getMovementKind();
        myMammal.getName();

        Animal myAnimal = lion;
        myAnimal.getSound();
        myAnimal.getName();
    }
}
