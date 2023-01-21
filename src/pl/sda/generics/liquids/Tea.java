package pl.sda.generics.liquids;

public class Tea extends Liquid {

    @Override
    public String toString() {
        return getClass().getName() + "@@@" + hashCode();
    }
}
