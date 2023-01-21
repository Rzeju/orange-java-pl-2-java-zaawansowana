package pl.sda.generics;

import pl.sda.generics.liquids.Liquid;

public class Cup<T extends Liquid> {

    private final T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }

    void drink() {
        System.out.println("Drinking " + liquid);
    }

    public <T extends Liquid> Cup<T> fullFillCup(T liquid) {
        return new Cup<>(liquid);
    }


}
