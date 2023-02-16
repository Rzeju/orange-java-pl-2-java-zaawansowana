package pl.sda.concurrency.callable_future;

//klasa reprezentująca bazę danych
//przetrzymuje w sobie wartość licznika
public class DataBase {

    //zmienna przechowująca wartość licznika
    //zmienna statyczna ma tylko jedną reprezentację na całą klasę (jest wspólna dla wszystkich obiektów tej klasy)
    //słowo kluczowe 'volatile' informuje maszynę wirtualną i procesor, aby nie optymalizować dostępu do tej zmiennej
    //wszelkie zmiany dla tej zmiennej będą aktualizowane natychmiast i dostępne dla innych wątków
    //ułatwia to przeprowadzania operacji wielowątkowych
    private static volatile int counter = 0;

    //metoda inkrementująca wartość licznika
    //metoda ta jest opatrzona słowem kluczowym 'synchronized'
    //oznacza to, że kod w tej metodzie może wykonywać tylko jeden wątek na raz
    //jeżeli usuniesz 'synchronized' program przestanie działać poprawnie
    public static synchronized int increment() throws InterruptedException {
        //zwiększenie licznika o 1
        int result = counter + 1;
        //uśpienie wątku
        //po usunięciu 'synchronized' przez tę instrukcję nastąpią problemy
        //jest to symulacja bardziej skomplikowanych operacji wielowątkowych, które mogą zajmować więcej czasu
        Thread.sleep(100);
        counter = result;
        return counter;
    }

    //getter dla pola counter
    //zwraca wartość licznika
    public static int getCounter() {
        return counter;
    }
}
