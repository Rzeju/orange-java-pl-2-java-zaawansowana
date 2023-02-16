package pl.sda.concurrency.dinner;

public class Dinner {

    //zainicjalizowane pole klasy Diner
    private boolean isDinnerReady = true;

    //metoda synchronizowana, tylko jeden wątek może wykonywać tę sekcję
    public synchronized void waitForDinner() {
        //sprawdzenie flagi, czy obiad gotowy
        //jeżeli obiad nie wiem gotowy wątek przejdzie w stan uśpienia
        while (!isDinnerReady) {
            //sprawdzenie czy wystąpił wyjątek
            try {
                //wątek przechodzi w stan uśpienia
                //w przypadku uśpienia wątku kolejny z nich może zacząć wywoływać tę metodę
                wait();
            //załapanie i obsługa wyjątku
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //zjedzenie posiłku
        //informacja pojawia się wraz z nazwą wątku, który zakończył wykonywanie tej metody
        System.out.println("Enjoy Your meal! " + Thread.currentThread().getName());
        //obiad zjedzony, flaga ustawiona an false
        isDinnerReady = false;
    }

    //metoda synchronizowana, tylko jeden wątek może wykonywać tę sekcję
    public synchronized void prepareDinner() {
        //wyświetlenie informacji o przygotowywaniu obiadu
        System.out.println("Dinner preparing");
        //sprawdzenie, czy wystąpił wyjątek
        try {
            //czas na przygotowanie obiadu
            Thread.sleep(1000);
        //załapanie i obsługa wyjątku
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //obiad gotowy, przestawienie flagi na true
        isDinnerReady = true;
        //poinformowanie uśpionego wątku, aby ponownie zaczął pracę
        //notify wybudza tylko jeden wątek
        notify();
    }
}
