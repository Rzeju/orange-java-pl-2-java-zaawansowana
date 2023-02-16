package pl.sda.concurrency.line;

public class Line {

    public void getLine(int lineNumber, int trainId) {
        //wyświetlenie informacji o oczekujących pociągach
        System.out.printf("Train %d awaits for line %d\n", trainId, lineNumber);
        //synchronizowany blok kodu
        //tylko jeden wątek może wykonywać ten blok kodu
        //'this' oznacza, że monitorem dla tego bloku jest obiekt, na którym wywołano metodę getLine()
        synchronized (this) {
            //informacja o pociągu aktualnie blokującym dany tor
            System.out.printf("Block line %d by Train %d\n", lineNumber, trainId);
            //blok try sprawdza, czy został rzucony wyjątek
            try {
                //oczekiwanie na zwolnienie toru
                Thread.sleep(1000);
            //przechwycenie i obsługa wyjątku
            } catch (Exception e) {
                System.out.println(e);
            }
            //informacja o zwolnieniu toru
            System.out.println("Line " + lineNumber + " available");
        }
    }
}
