package pl.sda.oop.inner_classes.anonymous;

//klasa, która implementuje Interface musi posiadać implementacje wszystkich metod abstrakcyjnych tego Interface'u
public class Anonymous implements AnonymousExample {

    @Override
    public void sayHello() {
        System.out.println("Say hello");
    }
}
