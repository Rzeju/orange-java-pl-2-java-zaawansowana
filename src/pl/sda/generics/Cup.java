package pl.sda.generics;

public class Cup<T> {

    private final T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }

    void drink() {
        System.out.println("Drinking " + liquid);
    }
}
