package pl.sda.oop.enumerated;

//klasa enum
//obiekty klasy enum mogą zawierać pola
//wartości tych pól muszą zostać podane w chwili deklaracji obiektów tej klasy
//obiekty tej klasy są tworzone raz i nie można ich później dodawać czy zmieniać
public enum Coffee {
    LATTE(10, Roast.BLONDE),
    ESPRESSO(0, Roast.DARK),
    AMERICANO(5, Roast.MEDIUM);

    //pola obiektów klasy enum
    private final int milk;
    //polem obiektu enum może być dowolny obiekt (np. inny enum)
    private final Roast roast;

    //konstruktor klasy enum
    //jest on niezbędny do utworzenia obiektów tej klasy (LATTE, ESPRESSO, AMERICANO)
    //konstruktor klasy enum jest zawsze prywatny (nie można tworzyć obiektów tej klasy poza klasą)
    //modyfikator 'private' jest tutaj szary (oznacza to, że jest zbędny - jest private domyślnie)
    private Coffee(int milk, Roast roast) {
        this.milk = milk;
        this.roast = roast;
    }

    //getter dla pola milk
    public int getMilk() {
        return milk;
    }

    //getter dla pola roast
    public Roast getRoast() {
        return roast;
    }


}
