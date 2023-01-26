package pl.sda.new_in_java_8_9.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String text = null;

        Optional<String> stringContainer = Optional.ofNullable(text);

        System.out.println(stringContainer.isPresent());
        System.out.println(stringContainer.isEmpty());
        System.out.println(stringContainer.orElse("Domyślny"));
        String defaultText = stringContainer.orElse("Domyślny");

        stringContainer = Optional.ofNullable("MyString");
        System.out.println(stringContainer.get());
        stringContainer.orElseThrow(() -> new IllegalArgumentException("Błąd"));


    }
}
