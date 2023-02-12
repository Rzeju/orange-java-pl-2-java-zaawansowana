package pl.sda.oop.inner_classes.local;

class LocalClasses {

    //metoda klasy LocalClasses
    public void createPair(String key, int value) {
        //wewnątrz metody możemy utworzyć klasę lokalną
        //w tym przypadku będzie to para klucz-wartość
        //klasa lokalna dostępna jest tylko w tej metodzie
        class Pair {
            //pola klasy lokalnej
            String key;
            int value;

            //metoda klasy lokalnej
            void getSome() {
                System.out.println("Local class method");
            }
        }
        //utworzenie obiektu klasy loklanej
        Pair pair = new Pair();
        //przypisanie wartości polom obiektu klasy lokalnej
        pair.key = key;
        pair.value = value;
        //wywołanie metody klasy lokalnej
        pair.getSome();
    }
}
