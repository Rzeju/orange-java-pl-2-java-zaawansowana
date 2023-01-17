package pl.sda.oop.inner_classes.anonymous;

public class Main {

    public static void main(String[] args) {

        AnonymousExample anonymousExample_1 = new AnonymousExample() {
            @Override
            public void sayHello() {
                System.out.println("Hello anonymousExample_1");
            }
        };

        //Wyrażenie lambda, robi to samo co powyżej dając jedynie inną implementacje metody (wyświetla co innego)
        //Tylko jeśli interfejs ma jedną metodę (interfejs z jedną metodą to interfejs funkcyjny)
        AnonymousExample anonymousExample_2 = () -> System.out.println("Hello anonymousExample_2");

    }
}
