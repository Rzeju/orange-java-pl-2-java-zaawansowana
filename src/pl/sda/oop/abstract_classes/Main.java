package pl.sda.oop.abstract_classes;

public class Main {

    public static void main(String[] args) {

        //utworzenie obiektu Honda
        Honda honda_1 = new Honda("12345", "XYZ");

        //wywołanie metody runEngine()
        honda_1.runEngine();
        //wypisanie wartości pól obiektu Honda
        //zauważ, że getter 'getVin()' został zaimplementowany w klasie Car i dzięki dziedziczeniu jest dostępny dla obiektów podklasy Honda
        System.out.println(honda_1.getVin());
        System.out.println(honda_1.getModel());

        //wywołanie nadpisanej metody z klasy Honda
        //na ekranie pojawi się komunikat zapisany w klasie Honda
        honda_1.someMethodToOverride();

        //Przykład polimorfizmu
        //obiekty typu Honda możemy przypisać do zmiennych typu Car (nadklasa)
        //uzyskujemy wtedy dostęp do metod zdefiniowanych tylko w tej klasie
        //getter dla pola 'model' nie będzie dostępny dla tej zmiennej, został on zdefiniowany w klasie Honda
        Car myCar = new Honda("324554436", "PKPKPK");
        //uruchomienie metody runEngine()
        //pomimo typu Car, metoda runEngine() wykona kod zawarty w klasie Honda
        //do zmiennej 'myCar' dostarczyliśmy implementacje Honda
        //polimorfizm pozwala nam na przypisywanie do zmiennej typu Car dowolnego typu obiektu, który dziedziczy po klasie Car
        //każdy taki obiekt musi implementować metodę abstrakcyjną runEngine()
        myCar.runEngine();
        //wywołanie metody 'someMethodToOverride()'
        //tutaj również zostanie wywołana implementacja z klasy Honda
        //klasa Car zawiera metodę 'someMethodToOverride()' stąd możemy ją wywołąc na naszej zmiennej
        //zostanie jednak uruchomiony kod zgodny z dostarczoną przez nas implementacją (obiekt typu Honda)
        myCar.someMethodToOverride();


    }
}
