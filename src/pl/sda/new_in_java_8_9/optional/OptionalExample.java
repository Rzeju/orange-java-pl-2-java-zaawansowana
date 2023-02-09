package pl.sda.new_in_java_8_9.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        //zmienna zainicjalizowana wartością null
        String text = null;

        //Utworzenie obiektu Optional<String> metodą ofNullable()
        //Metoda ta zezwala na przekazanie wartości null
        //Obiekt Optional jest opakowanie dla danego typu obiektowego
        //Ułatwia on współpracę z metoda, które mogą zwracać wartość null
        Optional<String> stringContainer = Optional.ofNullable(text);

        //Wywołanie metody isPresent()
        //Metoda ta sprawdza czy Optional zawiera jakiś obiekt
        //Metoda zwróci false ponieważ obecnie znajduje się tam wartość null
        System.out.println(stringContainer.isPresent());
        //Wywołanie metody isEmpty()
        //Metoda ta sprawdza czy obiekt Optional jest pusty (czy zawiera wartość null)
        //Metoda na zwróci true
        System.out.println(stringContainer.isEmpty());
        //Wywołanie metody orElse()
        //Metoda ta zwraca wartość domyślną jeżeli Optional zawiera w sobie wartość null
        //W naszym przypadku na ekranie zostanie wyświetlony komunikat "Domyślny"
        System.out.println(stringContainer.orElse("Domyślny"));
        //Zapisanie wyniku metody orElse() do zmiennej
        String defaultText = stringContainer.orElse("Domyślny");

        //Przypisanie do zmiennej nowego obiektu Optional z zawartością
        stringContainer = Optional.ofNullable("MyString");
        //Pobranie zawartości obiektu Optional i wypisanie go na ekran
        System.out.println(stringContainer.get());
        //Wywołanie metody orElseThrow()
        //Jeżeli obiekt Optional zawiera w sobie null metoda ta rzuci wyjątek
        //W naszym przypadku wyjątek nie zostanie rzucony. Obiekt Optional posiada zawartość
        stringContainer.orElseThrow(() -> new IllegalArgumentException("Błąd"));


    }
}
