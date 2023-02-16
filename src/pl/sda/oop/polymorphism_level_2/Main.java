package pl.sda.oop.polymorphism_level_2;

public class Main {

    public static void main(String[] args) {

        //utworzenie obiektu Lion
        Lion lion = new Lion("Lew 1", "Walking");
        //wywołanie metody getSound() i zapisanie zwróconej wartości do zmiennej
        String lionsSound = lion.getSound();
        //wywołanie metody getSound() i wypisanie zwróconej wartości na ekran
        System.out.println(lion.getSound());
        //wywołanie metody drink() metoda ta samodzielnie wypisuje komunikat na ekran
        lion.drink();
        //uruchomienie metody z klasy Lion
        //metoda ta nic nie robi
        lion.lionMethod();

        //przypisanie nowego obiektu do zmiennej typu Mammal
        //jest to przykład polimorfizmu, może używać typu nadklasy dla naszego obiektu typu Lion
        Mammal myMammal = new Lion("Lew 2", "Walking");
        //wywołanie metody drink()
        //metoda drink() jest zadeklarowana w klasie Mammal
        //zmienna tego typu może ją wywoływać
        //w uwagi na dostarczoną implementacje Lion wywołanie tej metody wykona kod zdefiniowany w klasie Lion
        myMammal.drink();
        //wywołąnie metody getSound()
        //metoda ta jest zdefiniowana w klasie Animal
        //klasa Mammal dziedziczy po klasie Animal w związku z czym zmiennej o typie Mammal moją dostęp do tej metody
        //wywołanie tej metody uruchomi kod z dostarczonej do zmiennej implementacji
        System.out.println(myMammal.getSound());
        //wypisanie pola movementKind na ekran
        System.out.println(myMammal.getMovementKind());
        //wypisanie pola name na ekran
        System.out.println(myMammal.getName());

        //przypisanie nowego obiektu do zmiennej typu Animal
        //jest to przykład polimorfizmu, może używać typu nadklasy dla naszego obiektu typu Lion
        Animal myAnimal = new Lion("Lew 3", "Walking");
        //wywołanie metody getSound() zdefiniowanej w klasie Animal
        //typują zmienną jako Animal mamy dostęp do metod zdefiniowanych w tej klasie
        //metody z klasy Mammal i Lion nie będą dla tej zmiennej dostępne
        //klasa Animal jest 'najwyżej' w strukturze dziedziczenia (to klasy Mammal i Lion dziedziczą po niej)
        System.out.println(myAnimal.getSound());
        //wypisanie na ekran pola name
        System.out.println(myAnimal.getName());
    }
}
